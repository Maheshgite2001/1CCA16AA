package pratice;

public class pattern1 {

    public static void main(String[] args) {
        int lin=4;
        int star=4;

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < star; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3)
                    System.out.print("*");
                  else
                    System.out.print(" ");


            }
            System.out.println();
        }
    }
}
