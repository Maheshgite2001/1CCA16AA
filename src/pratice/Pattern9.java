package pratice;

public class Pattern9 {
        public static void main(String[] args) {
            int line=4;
            int row=4;
            char ch='A';
            for (int i=0;i<line;i++) {
                for (int j = 0; j < row; j++) {
                    System.out.print(ch++);
                    if (ch > 'D')
                    ch = 'A';
                }

              System.out.println();
                ch++;
            }
        }
    }

