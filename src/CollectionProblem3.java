import java.util.*;
public class CollectionProblem3 {
public static void main(String[] args){
  Map<String,List<String>> departmentMapping=new HashMap<>();
  departmentMapping.put("Developer",Arrays.asList("John","Sam"));
  departmentMapping.put("Sales",Arrays.asList("Peter","Daniel"));
    departmentMapping.put("Admin",Arrays.asList("Elena"));
    departmentMapping.put("Hr",Arrays.asList("Jack","Mary"));
    departmentMapping.put("Manager",Arrays.asList("Shaun","Murphy"));
    for(Map.Entry<String,List<String>> entry:departmentMapping.entrySet() ){
        System.out.println("Department is:"+entry.getKey());
        System.out.println("Employee are:"+entry.getValue());
        System.out.println(entry.getKey()+":"+entry.getValue());

    }
}
}
