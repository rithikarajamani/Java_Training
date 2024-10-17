import java.util.*;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        //adding elements
        numbers.add(10);
        numbers.add(1000);
        numbers.add(12);
        numbers.add(50);
        //retrieving single element
        //System.out.println("values are:"+numbers);
        System.out.println("values are:"+numbers.get(1));
        //retrieving as a list using for loop
        for(int i=0;i<numbers.size();i++){
            System.out.println("values are using for loop:"+numbers.get(i));
        }
        //retrieving as a list using for each
        for(Integer values:numbers){
            System.out.println("values are using for each:"+values);
        }
        //removing elements
        numbers.remove(0);
        for(int i=0;i<numbers.size();i++){
            System.out.println("values are after removing first index:"+numbers.get(i));
        }
        //removing last element
        int num=numbers.remove(numbers.size()-1);
        System.out.println("removing last index:"+num);
        for(int i=0;i<numbers.size();i++){
            System.out.println("values are after removing first index:"+numbers.get(i));
        }
    }
}
