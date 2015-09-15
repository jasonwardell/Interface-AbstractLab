package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author jlwardell
 */
public abstract class ProgramCompletion {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);

    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract String setCourseNumber(String courseNumber);
    
        public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
        public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);

}
