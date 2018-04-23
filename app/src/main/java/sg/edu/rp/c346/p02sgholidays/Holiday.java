package sg.edu.rp.c346.p02sgholidays;

/**
 * Created by 16023054 on 23/4/2018.
 */

public class Holiday {
    private String name;
    private String date;
    private String image;
    private String description;
    public Holiday(String name, String date, String image, String description){
        this.name = name;
        this.date = date;
        this.image = image;
        this.description = description;
    }
    public String getName() {
        return name;}
    public String getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }
    public String getDescription(){
        return description;
    }
}
