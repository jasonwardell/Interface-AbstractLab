package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      jwardell
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgramCompletion {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    @Override
    public void setCourseName(String courseName) {
         if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String setCourseNumber(String courseNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
