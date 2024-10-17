import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements to the list
        list.add("rahul");
        list.add("jai");
        // list.add(32); // This line would cause a compile-time error as expected

        // Accessing an element (no need for type casting)
        String s = list.get(1);
        System.out.println("Element at index 1 is: " + s);

        // Using an Iterator to traverse the list
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
