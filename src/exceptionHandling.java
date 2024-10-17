public class exceptionHandling {
    public static void main(String[] args){
        try{
            int s=100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }finally{
            System.out.println("Hi there");
        }
    }
}
