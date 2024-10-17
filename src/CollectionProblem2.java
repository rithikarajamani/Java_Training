import java.util.*;

public class CollectionProblem2 {
    public static void main(String[] args){
        Set<String> employee=new TreeSet<String>();
        employee.add("John");
        employee.add("Sam");
        employee.add("Peter");
        employee.add("Elena");
        employee.add("Daniel");

        Iterator<String> i1=employee.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        Set<String> department=new TreeSet<String>();
        department.add("Developer");
        department.add("Sales");
        department.add("Admin");
        department.add("HR");
        department.add("Manager");
        Iterator<String> i2=department.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }

    }
}
