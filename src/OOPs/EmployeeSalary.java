package OOPs;

import java.util.Comparator;

public class EmployeeSalary implements Comparator<Employees> {

    @Override
    public int compare(Employees employees, Employees t1) {
        if(employees.getSalary()==t1.getSalary())
            return 1;
        else if(employees.getSalary()>t1.getSalary())
            return 1;
        else
            return 0;
    }
}

 class Employees{
     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     private double salary;
    public Employees(double salary){
        this.salary=salary;
    }
     public static void main(String[] args) {
         Employees e1=new Employees(12000);
         Employees e2=new Employees(10000);
         EmployeeSalary es1=new EmployeeSalary();
         if(es1.compare(e1,e2)==0)
             System.out.println("same salary");
         else if(es1.compare(e1,e2)==1)
             System.out.println("first employee high salary");
         else
             System.out.println("first employee low salary");
     }
}