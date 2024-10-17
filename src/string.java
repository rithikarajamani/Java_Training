import java.util.*;
public class string {
    public static void main(String[] args) {
        String name="rithika";
        String name2="rajamani";
        char letter='R';
        char letter2='I';
        StringBuffer sb=new StringBuffer();
        sb.append("rithika");
        sb.append("rajamani");
        sb.reverse();
        String message=sb.toString();
        String str="rithika";
        String reversed="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.print("reversed string is:"+reversed);
//        System.out.println("name is:"+name+" "+name2);
//        System.out.println("name is:"+letter+letter2);
//        System.out.println("buffer value is:"+message);
    }
}
