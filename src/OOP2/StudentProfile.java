package OOP2;
class Contact{


    String phoneNUm="";

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNUm='" + phoneNUm + '\'' +
                '}';
    }
}
public class StudentProfile implements Cloneable {
    Contact c = new Contact();
    String name = "";
    int id;
    int age;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        StudentProfile studentNew = (StudentProfile) super.clone();
        studentNew.c = new Contact();
        studentNew.c.phoneNUm = c.phoneNUm;
        return studentNew;
       // return super.clone();
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "c=" + c +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
    class Simpleeee {
        public static void main(String[] args) throws CloneNotSupportedException {

            StudentProfile st = new StudentProfile();
            st.c.phoneNUm = "9597";
            st.name = "kolanchi";
            st.age = 21;
            st.id = 1234;
            StudentProfile st2 = (StudentProfile)st.clone();
            st2.c.phoneNUm = "984343";
            System.out.println(st);
            System.out.println(st.hashCode());
            System.out.println(st2);
            System.out.println(st2.hashCode());

        }

    }


