package pratice;

public class Pattern7 {
    public static void main(String[] args) {
        int line = 4;
        int star = 4;
        int rows=5;
        char ch = 'A';
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(ch);
                ch++;
            }
            for(int k=rows;k>=i;k--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
