import java.io.Serializable;

public class Pers implements Serializable {
    private static final long serialVersionUID = 1L; // Unique ID for serialization
    private String name;
    private int age;

    // Constructor
    public Pers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
