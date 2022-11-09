package pratice;

import java.util.Scanner;

public class MainApp123 {

    public static void main(String[] args) {
        System.out.println("select payment type");
        System.out.println("1.UPI 2.Cash on delivery 3.Card 4.Net banking");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        PaymentDetails pd = new PaymentDetails();
        switch (ch) {
            case 1:
                System.out.println("enter pin");
                int pin= sc.nextInt();
                pd.payment(pin);
                break;
            case 2:
                System.out.println("enter address");
                String add=sc.next();
                pd.payment(add);
                break;
            case 3:System.out.println("enter address");
                int cvv= sc.nextInt();
                int cardNo= sc.nextInt();
                long acc= sc.nextInt();
                int expDate= sc.nextInt();
                String username= sc.next();
                pd.payment(cvv,acc,expDate,username);
                break;
            case 4:
                int cardNo1= sc.nextInt();
                long acc1= sc.nextInt();
                int expDate1= sc.nextInt();
                String username1= sc.next();
                pd.payment(cardNo1,acc1,expDate1,username1);
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}

