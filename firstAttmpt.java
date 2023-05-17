import java.util.Scanner;

public class firstAttmpt {
    public static void main(String[] args) {
        Scanner valid = new Scanner(System.in);
        System.out.println("Please type in  a valid ussd");
        String identifier = valid.nextLine();

        if (identifier.charAt(0) == '*' && identifier.charAt(4) == '#') {
            if (identifier.charAt(1) == '1' && identifier.charAt(2) == '8' && identifier.charAt(3) == '2') {
                System.out.println(
                        " 1) send Money\n 2) Buy \n 3)pay Bill \n 4) bank Service\n 5) Mokash \n 6) My Momo Account \n 7) Appending Approvals \n 8) Momo Pay \n 9) My Momo Security \n n Next ");
                System.out.println("_______________________________________________________________");
                Scanner number = new Scanner(System.in);
                int inPut = number.nextInt();
                switch (inPut) {
                    case 1:
                        System.out.println(
                                " 1) MoMo User\n 2) Send to eKash \n 3)Across the Region \n 4) Cancel Voucher\n 5) Display Voucher \n 6) List Active Voucher \n 7) International Transfer \n 8) Exchange Rate \n 9) Exit \n n Next ");
                        System.out.println("_______________________________________________________________");
                        break;
                    case 2:
                        System.out.println(
                                " 1) Buy Airtime \n 2) Electricity \n 3) Pay Services \n 4) Solar \n 5) bus Tap&Go \n 6) Online Shopping Card \n 0) Back");
                        break;
                    default:
                        System.out.println("Your choice was incorrect. Please try \n again.");
                }
            } else if (identifier.charAt(1) == '5' && identifier.charAt(2) == '0' && identifier.charAt(3) == '0') {
                System.out.println();
            } else {
                System.out.println(identifier);
                System.out.println("UNKOWN APPLICATION");
            }
        } else {
            System.out.println("Invalid ussd ");
        }
    }
}