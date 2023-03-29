public class inheritanceyk {

    public static void main(String[] args) {
        inhet a = new inhet();
        a.yash();
        a.niraj();
        System.out.println();

        nil b = new nil();
        b.yash();
        b.niraj();
        b.tejas();
    }
    
    void yash()
    {
        System.out.println("I am Yash");
        int a= 10, b=20;
        int c = a+b;
        System.out.println(c);
    }
}

class inhet extends inheritanceyk{
    void niraj(){
        System.out.println("I am niraj");
    }

  
}

class nil extends inhet{
    void tejas(){
        System.out.println("I am tejas");
    } 
}
