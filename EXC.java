import java.util.*;

class EXC{

    public static void main(String[] args) {
      
try {
    int a =5,b=5;
    System.out.println(a/b);
} catch (ArithmeticException ae) {
    System.out.println("Cannot divide by Zero : ");
}finally
{
    System.out.println("This is finally ");
}
       
   

    }}

