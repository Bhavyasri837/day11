import java.util.*;
public class main6 {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(35);
        a.add(67);
        a.add(56);
        a.add(96);
        a.add(34);
        a.add(64);
        System.out.println(a);
        a.add(3,1000000);
        System.err.println(a);
        a.set(1,12345);
        System.out.println(a);
        
    }
    
}
