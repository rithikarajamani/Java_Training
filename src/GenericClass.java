
class Box<T> {
    // A variable of type T
    private T item;

    // Constructor to initialize item
    public Box(T item) {
        this.item = item;
    }

    // Getter to retrieve the item
    public T getItem() {
        return item;
    }

    // Setter to set the item
    public void setItem(T item) {
        this.item = item;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Create a Box for Integer type
        Box<Integer> b1 = new Box<>(100); // Initialized with value 100
        System.out.println("Integer value: " + b1.getItem()); // Prints: Integer value: 100

        // Create a Box for String type
        Box<String> b2 = new Box<>("Hello Generics");
        System.out.println("String value: " + b2.getItem()); // Prints: String value: Hello Generics

        // Modify the value stored in Box b1
        b1.setItem(200);
        System.out.println("Updated Integer value: " + b1.getItem()); // Prints: Updated Integer value: 200
    }
}
