package pratice;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int avg=0;
        for(int i=1;i<=10;i++) {
            int n = sc.nextInt();
            sum+=n;
        }
        avg=sum/10;
        System.out.println(avg);

        }

    }

