
package lab1;

/**
 *
 * @author jlwardell
 */
public class RunMain {
    public static void main(String[] args) {
        
        ProgramCompletion ajc = new AdvancedJavaCourse();
        ProgramCompletion ijc = new IntroJavaCourse();
        ProgramCompletion itpc = new IntroToProgrammingCourse();    
        
        ajc.getCourseName();
        ijc.getCourseNumber();
        itpc.getCredits();
                
    }
}
