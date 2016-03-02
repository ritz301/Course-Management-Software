package coursemanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;

public class CourseManagementSoftware implements Serializable{
    
    transient private MainGUI mg; 
    private static ArrayList<ArrayList<Courses>> cpar = new ArrayList<>();
    
    public CourseManagementSoftware() {
        ArrayList<Courses> cobj;
        for(int i = 0; i < 5; i++){
            cobj = new ArrayList<>();
            cpar.add(cobj);
        }
        mg = new MainGUI();
        mg.setMg(mg);
        mg.setCpar(cpar);
        mg.displayCourses();
        mg.setTitle("Course Management System");
        mg.setVisible(true);
    }
    
    public static void main(String[] args) {
        CourseManagementSoftware cms = new CourseManagementSoftware();
    }
    
}
