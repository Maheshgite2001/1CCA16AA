package pratice;

import java.util.Scanner;

public class Dwhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("enter number for start addition ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        while (i < b) {

            sum = sum + i;
            System.out.println(sum);
            i++;
        }







    }






}
