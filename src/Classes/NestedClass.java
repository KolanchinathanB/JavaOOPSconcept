package Classes;


class Vehicle{
    private String vehicleTypes="Four wheel";
    private static int noOfWheels=4;
      private class Cars{
        private String model="BMW";
        private double price=500000;
        private int speed=200;
       // private static int noOfWheels=4;
          //private static final int noOfWheels=4;
          final int noOfWheels=4;

    }
     protected void show(){}

    public static void main(String[] args) {
       Vehicle v1=new Vehicle();
       Vehicle.Cars c1= v1.new Cars();
       System.out.println(c1.model);
       System.out.println(c1.price);
       System.out.println(c1.speed);

    }
}
public  class NestedClass extends Vehicle {
    public static void main(String[] args) {
//        Vehicle v1=new Vehicle();
//        Vehicle.Cars c1= v1.new Cars();
     //   Cars c=new Cars();

    }
    @Override
       public void show(){}
}
