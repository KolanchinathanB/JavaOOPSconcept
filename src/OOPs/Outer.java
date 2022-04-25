package OOPs;

public interface Outer {

    interface  inner{                 // inner interface always public not private,protected
       void show();
    }
    void display();
}
class NestedInterFace implements Outer.inner,Outer{       // cannot implement directly inner interface //(using outer.inner)

    @Override
    public void show() {
        System.out.println("inner method override");
    }

    @Override
    public void display() {
        System.out.println("outer method override");
    }
}
class Main{
    public static void main(String[] args) {
        NestedInterFace n=new NestedInterFace();
        n.display();
        n.show();

        Outer o=new NestedInterFace();     // object creation using outer interface
        o.display();

        Outer.inner oi=new NestedInterFace();   // object creation using inner interface
        oi.show();

//          NestedInterFace n1=new NestedInterFace(){          // using anonymous
//            public void show() {
//                System.out.println("inner method override");
//            }
//        };
    }
}
