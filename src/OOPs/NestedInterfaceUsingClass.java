package OOPs;

public class NestedInterfaceUsingClass {
    interface Inner{
        void display();
    }
}
class A1 implements NestedInterfaceUsingClass.Inner{

    @Override
    public void display() {
        System.out.println("inner interface method");
    }
}
