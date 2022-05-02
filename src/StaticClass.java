public class StaticClass {
    StaticClass(){
        System.out.println("1");
    }
    private int a=10;
    private static int c=12;
    int b=11;
    private static class  SubClass{
        SubClass(){
        }
        int d=20;
        static int e=12;
        private int f=10;
        public void display(){
//            System.out.println(a);
//            System.out.println(b);      // cannot access non-static field
            System.out.println(c);     // access only static member
        }
    }

    public static void main(String[] args) {
        SubClass sb=new SubClass(){
            @Override
            public void display() {

            }
        };
        sb.display();
//        StaticClass st=new StaticClass();
//        System.out.println(sb.d);
//        System.out.println(sb.f);
//        System.out.println(SubClass.e);
//        System.out.println(st.a);
//        System.out.println(st.b);
//        System.out.println(StaticClass.c);
    }
}
