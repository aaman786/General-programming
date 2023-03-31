
class Base {
    public Base() {
        System.out.println("I am base class constructor");
    }

    public void runMethod() {
        System.out.println("I am run method");

    }
}

class Derived extends Base {
    int j = 22;

    public int Derived() {
        super.runMethod();
        System.out.println("I am a derived class constructor");
        return j;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Derived derived = new Derived();

    }
}
