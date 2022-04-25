package OOPs;

import java.util.ArrayList;

public class Employee {
    private String userName="nathan";
    private String name;
    private int age;
    private int id;
    Employee(String n,int i,int a){
        this.name=n;
        this.id=i;
        this.age=a;
    }
    @Override
    public String toString(){
        return name+","+id+","+age;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Nathan",1234,21);
        Employee e2=new Employee("Kolanchi",1234,21);
        System.out.println(e1);

    }

}
