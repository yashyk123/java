import java.util.*;

class Exception {

    public static void main(String[] args) {
      
    
   try {
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double a = sc.nextInt();

        System.out.println("Enter Second number : ");
        double b = sc.nextInt();

        double c = a / b;
        System.out.println(c);

    }catch(ArithmeticException e)
    {
        System.out.println(e);
    }

     

    }}