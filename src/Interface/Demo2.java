package Interface;


import java.util.Scanner;

interface CreditCard{
    double creditLimit=30000;
    void creditPayment(double creditAmount);

}
interface DebitCard{
    void debitPayment(double debitAmount);
}
class Payment implements CreditCard,DebitCard{
    private double mainBalance;
    private double creditBalance=0;
    @Override
    public void creditPayment(double creditAmount) {
       if(creditLimit>=creditAmount) {
           creditBalance -= creditAmount;
           System.out.println("Credited successfully");
           System.out.println("Credit Balance  : "+creditBalance);

       }
       else
           System.out.println("your credit limit is Rs.30000/-\n please enter valid amount");

    }

    @Override
    public void debitPayment(double debitAmount) {
        if(mainBalance>=debitAmount) {
            mainBalance -= debitAmount;
            System.out.println("Debited successfully");
            System.out.println("Main Balance  : "+mainBalance);
        }
        else
            System.out.println("insufficient balance");


    }
}
class Account{
    private String name;
    private int id;
    private double bal;
    Account(String n,int i,double b){
        this.id=i;
        this.bal=b;
        this.name=n;
    }

}
class User {
    public static void main(String[] args)
    {
        Account user1=new Account("kolanchi",123,12000);
        Demo2 d1=new Demo2();
        d1.payment(user1);
    }

}
public class Demo2 {
      void payment(Account user){
        Scanner input=new Scanner(System.in);
        CreditCard user1=new Payment();
        DebitCard user2=new Payment();

        System.out.println("choose payment \n 1.Credit Card\n 2.Debit Card");
        switch(input.nextInt()){
            case 1: {
                System.out.println("credit payment");
                System.out.println("Enter your amount");
                double amount=input.nextDouble();
                user1.creditPayment(amount);
                break;
            }
            case 2: {
                System.out.println("Debit payment");
                System.out.println("Enter your amount");
                double amount = input.nextDouble();
                user2.debitPayment(amount);
                break;
            }
        }

    }


}
