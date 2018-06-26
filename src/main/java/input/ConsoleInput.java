package input;

import progressions.Progression;
import validators.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleInput implements I_Input{

    public Progression input() throws Exception {
        String type, start, dif, count;
        Progression result = new Progression();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Validator v = new Validator();

        System.out.print("Input progression type (AP/GP/HP):");
        type = br.readLine();
        while (!v.validateType(type)){
            System.out.print("Type is not valid. Please input progression type again (AP/GP/HP):");
            type = br.readLine();
        }

        System.out.print("Input start element: ");
        start = br.readLine();
        while (!v.isNumeric(start)){
            System.out.print("Start element must be a number (0-9). Please input again: ");
            start = br.readLine();
        }

        System.out.print("Input difference: ");
        dif = br.readLine();
        while (!v.isNumeric(dif)){
            System.out.print("Difference must be a number (0-9). Please input again: ");
            dif = br.readLine();
        }

        System.out.print("Input element amount: ");
        count = br.readLine();
        while (!v.isNumeric(count)){
            System.out.print("Element count must be a number (0-9). Please input again: ");
            count = br.readLine();
        }

        result.set_type(type);
        result.set_start(Integer.parseInt(start));
        result.set_difference(Integer.parseInt(dif));
        result.set_elementCount(Integer.parseInt(count));

        return result;
    }
}
