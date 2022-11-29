import java.util.Arrays;
import java.util.LinkedList;

public class NumberFunction {
    
    NumberFunction(){
        System.out.println("this is number function class");
    }

    public boolean check(long A[],long B[],int N){
    Arrays.sort(A);
    Arrays.sort(B);
    LinkedList<Long> linkarray1 = new LinkedList<Long>();
    LinkedList<Long> linkarray2 = new LinkedList<Long>();
        for(int j=0;j<=N-1;j++)
        {
            linkarray1.add(A[j]);
            linkarray2.add(B[j]);
        }
        System.out.println(linkarray1);
        System.out.println(linkarray2);
    if(linkarray1.size() == linkarray2.size())
    {
        System.out.println("Hai same");
        
        if(linkarray1.equals(linkarray2)){
            System.out.println("Hai same here");
            return true;
        }
    else{
        return false;
    }
    }
    else{
        return false;
    }


}
}
