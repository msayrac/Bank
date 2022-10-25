import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Please enter amount : ");
        double price = input.nextDouble();

        System.out.print("Card Number : ");

        String cardNumber = input.next();

        System.out.print("Expiration date : ");

        String date = input.next();

        System.out.print("Security cvc number : ");
        String cvc =input.next();

        System.out.println("1. A Bank");
        System.out.println("2. B Bank");
        System.out.println("3. C Bank");
        System.out.print("Choice Bank : ");


        int selectBank = input.nextInt();
        switch (selectBank){
            case 1 :

                ABank aPos = new ABank("A Bank", "123456","12345");
                aPos.connect("12345");
                aPos.payment(price,cardNumber,date,cvc);

                break;
            case 2 :
                BBank bPos = new BBank("B Bank", "12345678","1222345");
                bPos.connect("12345");
                bPos.payment(price,cardNumber,date,cvc);

            default:
                System.out.println("Please choice bank from the above list");
        }





    }
}