package coursemanagementsoftware;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Courses implements Serializable{
    private String Name;
    private int Fee;
    private String Date;
    private Faculty Faculty = new Faculty();
    private ArrayList<Faculty> Facs = new ArrayList<>();
    private ArrayList<Participant> Parts = new ArrayList<>();
    private int noOfParticipants = 0;
    private int duration;
    private static final int Limit = 10;
    private static int Number = 0;
    private int noOfInstructors = 0;
    private static final Scanner reader = new Scanner(System.in);

    public ArrayList<Faculty> getFacs() {
        return Facs;
    }

    public ArrayList<Participant> getParts() {
        return Parts;
    }
    
    public String getName(){
        return Name;
    }
    public String getDate(){
        return Date;
    }
    public int getFee(){
        return Fee;
    }
    public Faculty getFaculty(){
        return Faculty;
    }

    public int getDuration(){
        return duration;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setDate(String Date){
        this.Date = Date;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public void setFee(int Fee){
        this.Fee = Fee;
    }
    
}
