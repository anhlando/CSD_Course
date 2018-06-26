import input.ConsoleInput;
import input.I_Input;
import processors.APProcessor;
import processors.GPProcessor;
import processors.IProcessor;
import progressions.Progression;

public class ApplicationContext {

    public static void main(String[] args){
        try {
            Progression progression = new Progression();
            I_Input input = new ConsoleInput();
            IProcessor processor;
            progression = input.input();

            if (progression.get_type().trim().toUpperCase().equals("AP")){
                processor = new APProcessor(progression);
                System.out.print("Result: " + processor.process());
            }
            else if (progression.get_type().trim().toUpperCase().equals("GP")){
                processor = new GPProcessor(progression);
                System.out.print("Result: " + processor.process());
            }
            else {
                System.out.print("This kind of progression is not supported yet, please try again later!!!");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
