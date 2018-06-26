package validators;

public class Validator {

    public boolean validateType(String type){
        return (type.trim().toUpperCase().matches("AP|GP|HP"));

    }

    public boolean isNumeric(String s){
        return (s.trim().matches("[0-9]"));
    }
}
