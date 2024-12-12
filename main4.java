import java.util.*;
interface out
{
    void outm();
    interface in{
        void inm();
    }
}
public class main4 implements out.in {
    public void outm()
    {
        System.out.println("hello");
    }
    public void inm()
    {
        System.out.println("i am from inner interface");
    }
    public static void main(String args[])
    {
        main4 m=new main4();
        m.outm();
        m.inm();
    }
}
