import java.util.ArrayList;

interface New{
  void sum();
}
class NewClass{
    static void show(){
        System.out.println("hi");
    }
}

public class StaticClass {
    StaticClass(){
        System.out.println("1");
    }
    private int a=10;
    private static int c=12;
    int b=11;
    private static class  SubClass{
        SubClass(){
        }
        int d=20;
        static int e=12;
        private int f=10;
        public void display(){
//            System.out.println(a);
//            System.out.println(b);      // cannot access non-static field
            System.out.println(c);     // access only static member
        }
    }

    public static void main(String[] args) {
          sum(12,0);
        SubClass sb=new SubClass(){
            int a=10;
            @Override
            public void display() {

            }
        };

//        sb.display();
//       // New n=(a,b)->a+b;                     //lambda expression
//        //New n1=NewClass::show;                // method reference
//        //n.sum(12,13);
//
//        StaticClass st=new StaticClass();
//        System.out.println(sb.d);
//        System.out.println(sb.f);
//        System.out.println(SubClass.e);
//        System.out.println(st.a);
//        System.out.println(st.b);
//        System.out.println(StaticClass.c);
    }
    static void sum(int a,int b)  {

       // System.out.println(a/b);
    }

}
