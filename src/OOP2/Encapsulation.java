package OOP2;
class Private{
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    private int val=10;

}
public class Encapsulation {
    public static void main(String[] args) {
        Private p=new Private();
        p.getVal();

    }

}
