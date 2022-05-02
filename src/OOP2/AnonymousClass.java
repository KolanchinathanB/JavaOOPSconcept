package OOP2;

interface Car{
    int val=10;       // interface variable by default public static final
    void drive();
}
abstract class Bike{
    abstract void ride();
}
class Bus{
    int noOfPassengers=50;
}
public class AnonymousClass  {


    public static void main(String[] args) {

        Car c=new Car(){
            @Override
            public void drive() {                        // interface
                System.out.println("Driving a Car");
            }


        };
          //   System.out.println(AnonymousClass.price);       // cannot access inner class variable
        Bike b=new Bike() {
            @Override                                 // abstract class
            void ride() {
                System.out.println("Riding a Bike");
            }
        };
        Bus bus=new Bus(){
            void busProperties(){                         // class
                System.out.println(noOfPassengers);
            }
        };

    }
    void display(){
        Bike b=new Bike(){
            static final int n=10;
            @Override
            void ride() {

                System.out.println("Riding a Bike ");
            }
        };
    }
}

// anonymous class has no name
// anonymous cannot extend other class
// inner class file outerClass$innerClass.class
// anonymous class file SuperClass$1.class

// protected ,private class not allowed top-level class
// class cannot be static
// can declare private inner/nested class
// cannot accessed private class properties outside
//can accessed protected properties same package and different package-(sub classes only)


