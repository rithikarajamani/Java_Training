import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionProblem1 {
    public static void main(String[] args){
        Set<String> employee=new HashSet<String>();
        Set<String> department=new HashSet<String>();
        employee.add("John");
        employee.add("Sam");
        employee.add("Peter");
        employee.add("Elena");
        employee.add("Daniel");
        employee.add("John");
        employee.add("Elena");
        Iterator<String> i1=employee.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        department.add("Developer");
        department.add("Sales");
        department.add("Admin");
        department.add("HR");
        department.add("Manager");
        department.add("Admin");
        department.add("HR");
        department.add("Developer");
        Iterator<String> i2=department.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        
    }
}
