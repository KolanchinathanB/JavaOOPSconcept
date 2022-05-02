package OOPs;

class BaseClass{
    BaseClass(){
        System.out.println("first");
    }
    BaseClass(int a,int b){

        System.out.println("second");
    }
    int value=10;
    public static void method(){
        System.out.println("Base class");
    }
}
public class StaticBindingClass extends BaseClass {
    StaticBindingClass(int a,int b){
        super(12,23);
        System.out.println("third");
    }

    public static void method(){
        System.out.println("sub- class");
    }
    void show(){
        System.out.println("sub- class void method");
    }

    public static void main(String[] args) {
//        BaseClass b=new BaseClass(21,12);
//        BaseClass b1=new StaticBindingClass();
//        b.method();
//        b1.method();
        //b1.show();

        StaticBindingClass s=new StaticBindingClass(12,21);

    }
}
