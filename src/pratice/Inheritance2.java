package pratice;

public class Inheritance2 {
    public static void main(String[] args) {
        Subclass sb=new Subclass();
       sb.supermethod();
       sb.submethod();
    }
}
class Subclass extends Superclass{
    void submethod()
    {
        System.out.println("subclass Access superclass ");
    }

}
class Superclass{
    void supermethod()
    {
        System.out.println("this is superclass");
    }
}
