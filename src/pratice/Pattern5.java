package pratice;

public class Pattern5 {
    public static void main(String[] args) {
        int col = 4;
        int row = 1;
        for (int i = 0; i < col; i++) {
            char ch = 'A';
            for (int j = 0; j < row; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            row++;
        }
    }
}