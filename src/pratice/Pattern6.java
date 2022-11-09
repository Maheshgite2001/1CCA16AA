package pratice;

public class Pattern6 {
    public static void main(String[] args) {
        int line=5;
        int star=5;
        char ch='A';
        for(int i=0;i<line;i++)
        {
            for(int j=0;j<star;j++)
            {
                System.out.print(ch);
                ch++;
                if(ch>'G')
                {
                    ch='A';
                }
            }
            System.out.println();

        }
    }
}
