import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationProcess {
    public static void main(String[] args) {
        Pers person = new Pers("Rithika Rajamani", 21);

        try (FileOutputStream fileOut = new FileOutputStream("person_ext.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            // Serialize the object
            out.writeObject(person);
            System.out.println("Object has been serialized and saved to person_ext.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
