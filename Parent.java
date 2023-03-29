public class Parent {
    
    public void chutya()
    {
        int a=10,b=4;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        yash y = new yash();
        y.chutya2();
        y.chutya();
    }
}

class yash extends Parent
{
    public void chutya2()
    {System.out.println("Addiion is : ");
        
    }
   
}




