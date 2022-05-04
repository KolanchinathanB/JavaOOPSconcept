package Classes;

import OOPs.MainAbstraction;

public class SingletonClass
{
    private static SingletonClass obj=new SingletonClass();
    public String s="";
    int i=0;
     private SingletonClass(){
         s="singleton Class"+i++;
     }
     public static SingletonClass getObject(){
         if(obj==null){
             obj=new SingletonClass();
         }
         return obj;
     }
}
class SingletonClassOne{
    public static void main(String[] args) {
        SingletonClass s1=SingletonClass.getObject();
        SingletonClass s2=SingletonClass.getObject();
        SingletonClass s3=SingletonClass.getObject();
        System.out.println(s1.s);
        System.out.println(s2.s);
        System.out.println(s3.s);
    }

}
