class Controller{
    public static void main(String args[]){
        // System.out.println("Hai this is the controller class");
        // StringFunction strfun = new StringFunction("Hai");
        // System.out.println("StringBuilder :  "+strfun.StringRever("ahteegnaS"));
        NumberFunction newfun = new NumberFunction();
        long a[] = {16,1,2,14,13,1,17};
        long b[] = {14,1,16,2,13,2,17};
        System.out.println(newfun.check(a,b,3));
    }
}