package OOPs;



class SuperClass{
    protected int $value=10;
    public SuperClass(){
        System.out.println("super class constructor called");
        String name="kolanchi";
        name="nathan";
    }
    SuperClass(int a){
        System.out.println("value is " +a);
    }
}
// static    // can assign variable
//instance   //
//super /this    either one
//protected variable   // can access different package- using child class object
//naming conversion  - can use underscore
//static
//const
//anonymous class -abstraction
public class SimpleClass extends SuperClass{
      protected  int varA=10;
     int val$=10;
     static int variable=10;
    public SimpleClass(){
        this("hi");
        //super(12);
        //super();
        //this(12);
        System.out.println("constructor called");

    }
    SimpleClass(String a){
        System.out.println("constructor  2 called");
    }

    static {
        System.out.println("static block called");
    }

    {
        val$=12;
        variable=12;
       // System.out.println("instance block called"+val);
    }

    public static void main(String[] args) {
       SimpleClass s=new SimpleClass();
       System.out.println();
          s.show(12,13);

//        s.show();
        //SimpleClass s1=new SimpleClass();
    }
    protected void show(int a,int b){
       // System.out.println(val);
        System.out.println("Normal method");
    }

}
