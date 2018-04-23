package sg.edu.rp.c346.p02sgholidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        int info = i.getIntExtra("type",9);
        TextView type = (TextView)findViewById(R.id.textView);
        if(info == 0){
            type.setText("Secular");
            lv = (ListView) this.findViewById(R.id.lvHoliday);

            // Create a few food objects in Food array
            holiday = new ArrayList<Holiday>();
            holiday.add(new Holiday("New Year's Day", "1 January 2018","new-year", "First day of the year"));
            holiday.add(new Holiday("Labour Day", "1 May 2018","labour-day", "Day to celebrate labour"));
            holiday.add(new Holiday("National Day", "9 August 2018","national-day", "Singapore roars to life on National Day, as it remembers its colourful rise to independence and beyond."));

            // Link this Activity object, the row.xml layout for
            //  each row and the food String array together
            aa = new HolidayAdapter(this, R.layout.row, holiday);
            lv.setAdapter(aa);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Holiday selectedHoliday = holiday.get(position);
                    Toast.makeText(MainActivity.this, selectedHoliday.getName()
                                    + " Date: " + selectedHoliday.getDate() + " \n" + selectedHoliday.getDescription(),
                            Toast.LENGTH_LONG).show();

                }
            });
        }else{
            type.setText("Ethnic & Religion");
            lv = (ListView) this.findViewById(R.id.lvHoliday);

            // Create a few food objects in Food array
            holiday = new ArrayList<Holiday>();
            holiday.add(new Holiday("Chinese New Year", "16 February 2018, 17 February 2018","cny", "With bright colours, non-stop revelry and sheer exuberance, Chinese New Year is one festival that demands all of your attention—and energy."));
            holiday.add(new Holiday("Good Friday", "30 March 2018","good-friday", "Day celebrating the death of Jesus, who was born again 3 days later"));
            holiday.add(new Holiday("Vesak Day", "29 May 2018","vesak-day", "Buddhists in Singapore and the world over celebrate the birth, enlightenment and death of Buddha on Vesak Day, a time of joy, peace and reflection."));
            holiday.add(new Holiday("Hari Raya Puasa", "15 June 2018","hari-raya-puasa", "On Hari Raya Aidilfitri, Muslims in Singapore end their time of fasting with a joyous celebration of forgiveness, fellowship and food."));
            holiday.add(new Holiday("Hari Raya Haji", "22 August 2018","hari-raya-haji" , "Muslims in Singapore remember their faith with prayer and reflection during Hari Raya Haji, also known as the Festival of Sacrifice."));
            holiday.add(new Holiday("Deepavali", "6 November 2018","deepavali", "The annual Hindu celebration of the triumph of light over darkness\n" +
                    "Bright colours, tantalising aromas and the light of a thousand oil lamps fill the streets of Little India during Deepavali."));
            holiday.add(new Holiday("Christmas", "25 December 2018","christmas", "You might not get real snow or reindeers, but Christmas in Singapore is as big as any other celebration during the year."));

            // Link this Activity object, the row.xml layout for
            //  each row and the food String array together
            aa = new HolidayAdapter(this, R.layout.row, holiday);
            lv.setAdapter(aa);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Holiday selectedHoliday = holiday.get(position);
                    Toast.makeText(MainActivity.this, selectedHoliday.getName()
                                    + " Date: " + selectedHoliday.getDate() + " \n" + selectedHoliday.getDescription(),
                            Toast.LENGTH_LONG).show();

                }
            });
        }


    }
}
