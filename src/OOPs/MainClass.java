package OOPs;

class Class1{
    void display(){
        System.out.println("class1");
    }
}
class Class2{
    void display(){
        System.out.println("class2");
    }
}
interface Interface1{
    default void show(){
        System.out.println("Interface-1");
    }
}
interface Interface2{
    default void show(){
        System.out.println("Interface-2");
    }
}
public class MainClass implements Interface1,Interface2 {

    public static void main(String[] args) {
      //  MainClass m=new MainClass();
        Interface1 i1=new MainClass();
        i1.show();
      //  m.show();
    }

    @Override
    public void show() {
        Interface1.super.show();
        Interface2.super.show();
    }
}
