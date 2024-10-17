class People {
    // Private variable (cannot be accessed directly from outside)
    private String name;

    // Getter method for 'name'
    public String getName() {
        return name; // Returns the value of 'name'
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name; // Assigns a new value to 'name'
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        // Create an instance of Person
        People person = new People();

        // Use the setter to set the name
        person.setName("John");

        // Use the getter to retrieve the name
        System.out.println("Person's name: " + person.getName()); // Outputs: Person's name: John
    }
}
