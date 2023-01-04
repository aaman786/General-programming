class Base {
    int a;

    public void greet() {
        System.out.println("Good Morning");
    }
}

class Derived extends Base {

    @Override
    public void greet() {
        // super.greet(); // ---> calling sub class method
        System.out.println("Good Morning to the Beautiful ppl");
    }
}

public class methodOveridding {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();
    }
}
