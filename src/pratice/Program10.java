package pratice;
public class Program10 {
    public static void main(String[] args) {
        int line=4;
        int star=4;
        char ch='A';
        for(int i=0;i<line;i++)
        {
            char ch1=ch;
            for(int j=0;j<star;j++)
            {
                System.out.print(ch1++);
            }
            ch++;
            System.out.println();
        }
    }
}
