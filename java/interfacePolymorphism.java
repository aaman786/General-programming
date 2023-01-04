
/* 
    With help of this we can make reference of interface and assign Derivied class obj to
    it. So that we can use the methods of interface only. 
 */

interface Camera {
    void takePic();

    void takeVideo();
}

interface gps {
    void shareLoc();
}

class SmartPhone implements Camera, gps {

    public void greet() {
        System.out.println("hello");
    }

    public void takePic() {
        System.out.println("TAking Snap....");
    }

    public void takeVideo() {
        System.out.println("TAking Video....");
    }

    public void shareLoc() {
        System.out.println("loc is....");
    }
}

public class interfacePolymorphism {
    public static void main(String[] args) {
        Camera cm = new SmartPhone();
        cm.takePic();
        // cm.greet(); --> not allowed

    }
}
