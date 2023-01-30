import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(14);
        l.add(15);

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
        }
        System.out.println();

        // l.contains(14); // return boolean value
        // l.indexOf(15);
        l.clear();
    }
}
