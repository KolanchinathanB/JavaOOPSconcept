package Classes;

class Inherited{
    private Inherited(){

    }
    public Inherited(String a){

    }
}
public class PrivateConstructor extends Inherited{             //can inherit
    String id;

    private PrivateConstructor(){
        super("");
    }
    private  PrivateConstructor(String i){
       this();
    }
    void show(){
        System.out.println("show");
    }

    public static void main(String[] args) {
        PrivateConstructor p1=new PrivateConstructor();
    }
}
class class2{
    public static void main(String[] args) {
   //     PrivateConstructor p2=new PrivateConstructor();
//       PrivateConstructor p3=new PrivateConstructor("1234");

    }
}
