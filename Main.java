import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        User u = new User();
        System.out.println("Enter ur name");
        String name = scan.nextLine();
        u.setName(name);

        System.out.println("Account number");
        int accNo = scan.nextInt();
        u.setAccNo(accNo);

        System.out.println("Your name: " + u.getName());
        System.out.println("Your account number: "+u.getAccNo());

        System.out.println("Enter ur available balance");
        int bal = scan.nextInt();

        System.out.println("1. Debit");
        System.out.println("2. Credit");
        int ch = scan.nextInt();

        Transaction t = new Transaction();
        switch (ch) {


            case 1:
                System.out.println("Enter the amount to be debited");
                int amt = scan.nextInt();
                System.out.println("Your available balance is "+t.debit(bal,amt));
                break;
                
            case 2:
                System.out.println("Enter the amount to be credited");
                int amt1 = scan.nextInt();
                System.out.println("Your available balance is "+t.credit(bal,amt1));
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }
    }
}

