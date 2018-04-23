package sg.edu.rp.c346.p02sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16023054 on 23/4/2018.
 */

public class HolidayAdapter extends ArrayAdapter<Holiday>{
    private ArrayList<Holiday> holidays;
    private Context context;
    private TextView name;
    private TextView date;
    private ImageView image;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        name = (TextView) rowView.findViewById(R.id.name);
        date = (TextView) rowView.findViewById(R.id.date);
        // Get the ImageView object
        image = (ImageView) rowView.findViewById(R.id.imageView);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holiday currentHoliday = holidays.get(position);
        // Set the TextView to show the food

        name.setText(currentHoliday.getName());
        date.setText(currentHoliday.getDate());
        // Set the image to star or nostar accordingly
        if(currentHoliday.getImage() == "christmas") {
            image.setImageResource(R.drawable.christmas);
        }
        else if (currentHoliday.getImage() == "cny") {
            image.setImageResource(R.drawable.cny);
        }
        else if (currentHoliday.getImage() == "deepavali") {
            image.setImageResource(R.drawable.deepavali);
        }else if (currentHoliday.getImage() == "good-friday") {
            image.setImageResource(R.drawable.good_friday);
        }else if (currentHoliday.getImage() == "hari-raya-haji") {
            image.setImageResource(R.drawable.hari_raya_haji);
        }else if (currentHoliday.getImage() == "hari-raya-puasa") {
            image.setImageResource(R.drawable.hari_raya_puasa);
        }else if (currentHoliday.getImage() == "labour-day") {
            image.setImageResource(R.drawable.labour_day);
        }else if (currentHoliday.getImage() == "national-day") {
            image.setImageResource(R.drawable.national_day);
        }else if (currentHoliday.getImage() == "new-year") {
            image.setImageResource(R.drawable.new_year);
        }else {
            image.setImageResource(R.drawable.vesak_day);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
