package Classes;



class Laptop{
   int a=10;
    static class Dell{
        private String id;
        private Dell(String id)
        {
            this.id=id;
        }
        private String modelName="Dell";
        private double price=50000;
        private static boolean touchScreen=false;
       // private static final boolean touchScreen =false;
        public  int a=10;

    }

    public static void main(String[] args) {
        Laptop.Dell d1=new Laptop.Dell("12345");
        System.out.println(d1.modelName);
        System.out.println(d1.price);

      //  System.out.println(d1.touchScreen);
       // System.out.println(Dell.touchScreen);


    }
}

public class NestedStaticClass {
    public static void main(String[] args) {
       // Laptop.Dell d2=new Laptop.Dell();
    }

}
