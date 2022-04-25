package OOPs;

interface Model{
    String printModelName();
}
class Lenova implements Model{
    String model="Lenova";
    @Override
    public String printModelName() {
       return model;
    }
}
class Dell implements Model{
    String model="Dell";
    @Override
    public String printModelName() {
        return model;
    }
}
public class Computer {
    public void modelName(Dell d){
        System.out.println("Model name is  "+ d.printModelName());
    }
    public void modelName(Lenova l){
        System.out.println("model name is  "+l.printModelName());
    }
    public static void main(String[] args) {
        Computer c=new Computer();
        Dell d=new Dell();
        c.modelName(d);
        Lenova l=new Lenova();
        c.modelName(l);

    }
}
