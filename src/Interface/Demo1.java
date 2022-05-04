package Interface;

interface Bank{
    void createAccount();
    double checkBalance();
    void deposit(double bal);
    float getInterest();
}
class SBI implements Bank{
    private String name="";
    private int age;
    private int id;
    private double bal;
    private float interest=12;

    SBI(String n,int a,int i){
        this.age=a;
        this.id=i;
        this.name=n;
        System.out.println("SBI Bank");

    }

    @Override
    public void createAccount() {
        System.out.println("created account successfully");

    }

    @Override
    public double checkBalance() {
       return bal;
    }

    @Override
    public void deposit(double balance) {
        System.out.println("Deposited successfully");
        this.bal+=balance;
    }
    @Override
    public float getInterest() {
        return interest;
    }

}
class IndianBank implements Bank{

    private String name="";
    private int age;
    private int id;
    private double bal=10000;


    private float interest=10;
    IndianBank(String n,int a,int i){
        this.age=a;
        this.id=i;
        this.name=n;
        System.out.println("Indian Bank");
    }
    @Override
    public void createAccount() {
        System.out.println("created account successfully");
    }

    @Override
    public double checkBalance() {
           return bal;
    }

    @Override
    public void deposit(double balance) {
        System.out.println("Deposited successfully");
         bal+=balance;
    }
    @Override
    public float getInterest() {
        return interest;
    }


}

public class Demo1 {
    public static void main(String[] args) {
        Bank person1=new SBI("kolanchi",21,123);
        person1.createAccount();
        person1.deposit(12000);
        System.out.println(person1.checkBalance());
        System.out.println(person1.getInterest());

        System.out.println();

        Bank person2=new IndianBank("kolanchi",21,123);
        person2.createAccount();
        person2.deposit(12000);
        System.out.println(person2.checkBalance());
        System.out.println(person2.getInterest());


    }

}
