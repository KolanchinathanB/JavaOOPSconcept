
class Contact implements Cloneable{
     String phoneNumber;
     int code;
    Contact(int c,String num){
        this.phoneNumber=num;
        this.code=c;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                "code= " +code+
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class Employee implements Cloneable
{
     String name;
     int id;
     int age;
    Contact contact;
    // constructor
    Employee(String n,int i,int a,Contact c)
    {
        this.name=n;
        this.age=a;
        this.id=i;
        this.contact=c;
    }


    //
    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ",contact= "+contact+
                '}';
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Employee e=(Employee) super.clone();
//        e.contact=(Contact) e.contact.clone();
//        return e;
        return super.clone();
    }
}
public class ShallowCopy
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        try {
            Contact c1 = new Contact(91,"9876543210");
            Employee e1 = new Employee("abc", 12, 21, c1);
            Employee e2 = (Employee) e1.clone();
            e2.id = 1;
            e2.name = "bb";
            e2.age = 12;
            e2.contact.code=92;
            e2.contact.phoneNumber = "9344";
            System.out.println(e1);
            System.out.println(e2);
        }
        catch (Exception c){
            System.out.println("exception");
        }

    }
}
