package OOPs;


// accessing private method in another class
public class OuterClass
{
    class InnerClass {
        private int a=10;
        private void display(){
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        OuterClass o=new OuterClass();
        InnerClass i=o.new InnerClass();
        i.display();

    }
}
