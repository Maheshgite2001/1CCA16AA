package pratice;
import java.util.Scanner;
public class Sns {
    public static void main(String[] args)
    {
        Sns s = new Sns();
        s.sub(2,4);
        Sns.add(2,3);
        Demo d=new Demo();
        Demo.div(2,6);
        d.mul(1,4);

    }
    public void sub(int a,int b) {
        System.out.println(a-b);
    }
    public static void add(int a,int b) {
        System.out.println(a+b);
    }
}
class Demo{
    public void mul(int a,int b)
    {System.out.println(a*b);
    }
    public static void div(int a, int b)
    {System.out.println(a/b);
    }
}