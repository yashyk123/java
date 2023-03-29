import java.util.*;
class Userexcep extends RuntimeException
{
    Userexcep(String msg)
    {
        super(msg);

    }
}
class voting
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int a = sc.nextInt();

        if(a<18)
        {
            throw  new Userexcep("Yedzavyaa");
            
        }
        else
        {
            System.out.println("You are eligible");
        }
    }
}