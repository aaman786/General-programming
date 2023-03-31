/* 
    1. Abstract method is the method which is medatory to define in derived class.
    2. An abstract method make's the whole class as an abstract.   
    3. It is not allowed to make obj of abstract class.
    4. Whenever deriving an new class from abstract class we have to overide that abstract 
       methods or make the new class as abstract class.
 */

abstract class Base {
    Base() {
        System.out.println("I am base class constructor.");
    }

    public void greet() {
        System.out.println("Hello users");
    }

    abstract public void greet2();
}

class Derived extends Base {
    Derived() {
        System.out.println("I am Derived class constructor.");

    }

    public void greet2() {
        System.out.println("Hello Beautiful users...");
    }

    void runn() {
        System.out.println("I am running");
    }
}

public class abstractClass {

    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();
        d.greet2();

        // Base base = new Derived(); // --> this is allowed
        // base.greet(); // --> this is allowed
        // base.runn(); // --> can't do this

    }
}
