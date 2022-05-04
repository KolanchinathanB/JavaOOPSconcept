package OOP2;


import OOPs.Temporary;

public class ChildClass extends Test {
    ChildClass(){
        System.out.println("child-c1");
    }
    ChildClass(int a){
       // super(12);
        System.out.println("child-c1");
    }

    public static void main(String[] args) {
        //Test t1=new Test();
       // Test t2=new Test(12);
        ChildClass c1=new ChildClass(12);
         final int val=10;
         int ans=10;

    }
}
// cannot call static block using super()