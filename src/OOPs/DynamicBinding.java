package OOPs;

import OOP2.Outerclass;


class First{
    First(){
        System.out.println("first");
    }
}

class BaseClass1 extends First{
//    BaseClass1(){
//        System.out.println("second");
//    }
    void method(){
        System.out.println("Super class ");
    }
}
public class DynamicBinding extends BaseClass1{
    DynamicBinding(){
        super();
        System.out.println("Third");
    }
    @Override
    void method(){
        System.out.println("Sub- class ");
    }

    public static void main(String[] args) {
        DynamicBinding d=new DynamicBinding();
//       BaseClass1 b1=new DynamicBinding();
//       b1.method();

    }

}
