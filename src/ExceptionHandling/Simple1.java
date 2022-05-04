package ExceptionHandling;

public class Simple1 {

    public static void main(String[] args) {
        int a=10;
        int b=0;
//        try{
//            int c=a/b;      // exception occurred
//        }
//        catch (ArithmeticException e){
//            System.out.println("Exception occurred1");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception occurred2");
//        }
//        catch (Exception e){
//            System.out.println("Exception occurred3");         // exception handled
//        }
//        finally
//        {
//            System.out.println("finish");
//        }
        try {
            Simple1 s1=new Simple1();
            s1.sumOfArray();
        }
        catch (Exception e){
           e.printStackTrace();
        }

    }
    public  void sumOfArray() {
        int sum=0;
        int a[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("sum is = "+sum);
        //throw new ArrayIndexOutOfBoundsException();
        //System.out.println(a[10]);
        //System.out.println(10/0);
    }
    void display(){

    }
}
class NewSample extends Simple1{
    @Override
    public void sumOfArray() throws ArrayIndexOutOfBoundsException,ArithmeticException {
       System.out.println("hi");
    }

    @Override
    void display()throws ArithmeticException {
        super.display();
    }

    public static void main(String[] args) {
        NewSample s1=new NewSample();
        s1.sumOfArray();
        Simple1 s2=new NewSample();
        s2.sumOfArray();
    }
}
