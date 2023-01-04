/* 
    what is an Interface?
     Interfaces are the group of related methods with contain empty bodies and while
     making any new class from it, we need to implement each and every method in that class.
     
    Difference between interfaces and abstract classes.
    1. We can't make a class with the help of different number of adstract classes 
       or only classes.
    2. We need to define each and eveery method of interface again in new class. While 
       in abstract class we need to define only abstract methods.
    3. We can make multiple interfaces and derive a class from it. While Abstract class does 
       not support this thing. 
 */

interface Bicycle {
    int speed = 10; // it's final thus can't change or modify it

    void brake();

    void accelerate();
}

class AvonCycle implements Bicycle {
    public void brake() {
        System.out.println("Applying the brakes");
    }

    public void accelerate() {

        System.out.println("Increasing the speed");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.brake();
    }
}
