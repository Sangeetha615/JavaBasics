public class StringFunction {
    StringFunction(String value){
    System.out.println("This is the StringFunction class");
    }

    public String StringRever(String stringValue)
    {
        StringBuilder strbul = new StringBuilder(stringValue);
        strbul.reverse();
        return strbul.toString();
    }
}
