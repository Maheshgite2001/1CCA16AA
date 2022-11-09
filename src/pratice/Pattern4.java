package pratice;
public class Pattern4 {
    public static void main(String[] args) {
        int col=4;
        int row=1;
        char ch='A';
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            row++;
            ch++;
        }
    }

}
