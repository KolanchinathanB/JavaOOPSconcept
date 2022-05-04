package Interface;

interface Interface1
{
      void show();
    interface Interface2
    {
     void display();
    }
    class Temp
    {
        int a=10;
    }
}

public class Demo3 implements Interface1.Interface2
{
    @Override
    public void display()
    {

    }

    public static void main(String[] args)
    {
        Interface1.Temp t=new Interface1.Temp();
        System.out.println(t.a);


    }
}
