package OOP2;

import OOPs.OuterClass;

public class Outerclass {
    private int first=1;
    private int second=2;
    protected     class InnerClass{
        public int third=3;
        private int four=4;
         void getnum(){

            System.out.println(first);
            System.out.println(third);
            System.out.println(four);
        }

    }
    void get(){
        Outerclass o=new Outerclass();

        InnerClass i=new InnerClass();
        System.out.println(first);
        System.out.println(second);
        System.out.println(i.third);
        System.out.println(i.four);

    }



    public static void main(String[] args) {
         Outerclass o=new Outerclass();
          Outerclass.InnerClass i=o.new InnerClass();
       // InnerClass i=o.new InnerClass();
//        System.out.println(i.third);
//        System.out.println(i.four);

    }
}

// private ,protected allowed only nested,inner class

// static declaration not allowed inner class
// can access outer class  variable in inner class
// can access inner class variable in outer class (object create) even private class
//