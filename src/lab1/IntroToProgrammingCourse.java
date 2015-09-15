package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      jwardell
 * @version     1.00
 */
public class IntroToProgrammingCourse extends IntroJavaCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        System.out.println("This course has no prerequisites.");
    }
    
}
