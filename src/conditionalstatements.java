import java.util.*;
public class conditionalstatements {
    public static void main(String[] args){
        int i=5;
        System.out.println("normal if else");
        if(i==5){
            System.out.println("the number is 5!");
        }
        else{
            System.out.println("The number is not 5!");
        }

        int number=10;
        System.out.println("if else-if else");
        if(number>10){
            System.out.println("the number is greater than 0!");
        }
        else if(number<5){
            System.out.println("the number is lesser than 5");
        }
        else{
            System.out.println("The number is idiot!");
        }
        System.out.println("nested if");
        int age=1;
        if(age>10){
            if(age==18){
                System.out.println("the person is qualified");
            }
        }
        else{
            System.out.println("the person is underage");
        }
        System.out.println("switch statement");
        int day=6;
        switch(day){
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("the day is wednesday");
                break;
            default:
                System.out.println("there is no day:(");
        }

    }

}
