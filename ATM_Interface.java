import java.util.Scanner;
public class ATM_Interface{
    public static void main(String args[]){
        int balance=100000;
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("1. Check Balance: ");
            System.out.println("2. Withdraw amount:");
            System.out.println("3. Exit");
            int choice=sc.nextInt();

            switch(choice){
                case 1: System.out.println("Your Balance:" + balance);
                break;

                case 2:
                System.out.println("Enter Amount:");
                int  Withdraw_Amount=sc.nextInt();
                if(Withdraw_Amount <=balance){
                    System.out.println("withdraw Amount: " + Withdraw_Amount +" Successfull ! ");
                    balance=balance-Withdraw_Amount;
                }else{
                    System.out.println("Insufficient Balance:");
                }
                break;

                case 3:
                System.out.println("Thant you for Using ATM machine !");
                break;

                default:
                System.out.println(" OPPS ! Invalid option ");

            }
        }
    }
}