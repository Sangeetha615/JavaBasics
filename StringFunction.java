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

    public String reverseWords(String S)
    {
        String[] Str = S.split("\\.");
        int strLen = Str.length;
        String outputValue = "";
        StringBuffer sb = new StringBuffer();
        for(int i = strLen; i > 0 ; i--){
            sb.append(Str[i-1]);
            sb.append(".");
            outputValue = sb.toString();
        }
        return outputValue;
    }
}
