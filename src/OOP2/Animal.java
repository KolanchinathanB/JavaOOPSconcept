package OOP2;

abstract class Animal {
    abstract void eat();

    public static void main(String[] args) {
        Animal a=new Cat();
        Animal b=new Dog();
        a.eat();
        b.eat();

    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("cat eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eating");
    }
}
