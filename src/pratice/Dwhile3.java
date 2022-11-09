package pratice;

import java.util.Scanner;

public class Dwhile3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 2 num");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            boolean status=true;
            do{

                System.out.println("enter choice");
                System.out.println("A.Add\nB.SUB\nE.EXIT");
                char ch=sc.next().charAt(0);
                switch (ch) {
                    case 'A' -> System.out.println(a + b);
                    case 'B' -> System.out.println(a - b);
                    case 'E' -> status = false;
                    default -> System.out.println("invalid choice");

                }
            } while(status);

        }
    }


