class Controller{
    public static void main(String args[]){
        System.out.println("Hai this is the controller class");
        StringFunction strfun = new StringFunction("Hai");
        System.out.println("StringBuilder :  "+strfun.StringRever("ahteegnaS"));
        String str = strfun.reverseWords("This.is.malini");
        System.out.println("this is the reversal of String:-> "+str);
        
    }
}