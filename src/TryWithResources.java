//import java.io.BufferedReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//public class TryWithResources {
//    public static void main(String[] args) throws NumberFormatException,IOException{
////        String name="";
////        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
////           name=br.readLine();
////           System.out.println("My name is:"+name);
////        }
//        try (FileWriter writer = new FileWriter("person.json")) {
//            writer.toJson(person, writer);
//            System.out.println("JSON file written successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private int age;


    // Constructors, Getters, Setters, and toString()
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        // Create a Person object
        //Person person = new Person("John", 25, true, Arrays.asList("Java", "Spring", "SQL"));
        Scanner scanner = new Scanner(System.in);

        // Get user input for the Person object
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        Person person = new Person(name, age);

        // Manually build a JSON string
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"name\": \"").append(person.getName()).append("\",\n");
        json.append("  \"age\": ").append(person.getAge()).append(",\n");
        json.append("}");

        // Write the JSON to a file
        try (FileWriter writer = new FileWriter("person.json")) {
            writer.write(json.toString());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("person.json"))) {
            String line;
            System.out.println("Reading JSON from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
