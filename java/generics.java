import java.util.HashMap;

class Calculation<T1, T2> {
    T1 a;
    T2 b;

    public Calculation(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public void print() {

        System.out.println(a);
        System.out.println(b);
    }

}

public class generics {

    public static void main(String[] args) {
        Calculation<Integer, String> cal = new Calculation<Integer, String>(4, "Aman");
        cal.print();
        HashMap<String, Integer> map = new <String, Integer>HashMap();
    }
}