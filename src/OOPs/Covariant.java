package OOPs;

public class Covariant {
   Covariant get(){return this;}
    void message(){System.out.println("Covariant class");}
}
class A extends Covariant{
    A get(){return this;}
    void message(){System.out.println("A class");}
}
class B extends Covariant{
    B get(){return this;}
    void message(){System.out.println("B class");}
}
 class Temp{
    public static void main(String[] args) {
        Covariant c=new Covariant();
        c.get().message();

        A a=new A();
        a.get().message();
        B b=new B();
        b.get().message();

    }

}
