package OOPs;

interface CreditCard{
 public void creditPayment(int amount);

}
interface DebitCard{
    public void debitPayment(int amount);
}
 class Payment implements CreditCard,DebitCard{
     private int accountBalance=10000;
     private int creditedamount=0;
     @Override
     public void creditPayment(int amount) {
         System.out.println("using Credit card payment");
         creditedamount-=amount;
         System.out.println("credited amount  "+creditedamount);
     }

     @Override
     public void debitPayment(int money) {
         System.out.println("using Debit card payment");
         accountBalance-=money;
         System.out.println("Remaining balance "+accountBalance);
     }
 }
public class MultipleInheritance extends Payment
{
    public static void main(String[] args) {
        DebitCard d=new Payment();
        CreditCard c=new Payment();
        d.debitPayment(2000);
        c.creditPayment(3000);

    }
}
