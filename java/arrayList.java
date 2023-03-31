import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(14);
        l.add(15);

        Iterator itr = l.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // l.contains(14); // return boolean value
        // l.indexOf(15);
        l.clear();
    }
}
