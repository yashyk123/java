class Thread1 
{
    public static void main(String[] args) {
     
     Thread t =new Thread();
        try{
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
            t.sleep(5000);
        }
    }catch( InterruptedException e)
    {
        System.out.println(e);
    }
        
    } 
    
    }
