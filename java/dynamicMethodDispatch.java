
class Phone {

    public void switchOnn() {
        System.out.println("Turning On normal phone.");
    }
}

class Smartphone extends Phone {
    public void switchOnn() {
        System.out.println("Turning On Smartphone.");

    }

    public void playy() {
        System.out.println("Turning On play mode.");

    }

}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
        obj.switchOnn();
        // obj.playy(); // --> not allowed

    }
}
