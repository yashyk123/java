public class Bookthreadseat
{
    int totalseat =10;
    synchronized void Bookseat(int seat)
    {
        if(totalseat>=seat){
            System.out.println("seat booked successfully");
            totalseat=totalseat-seat;
            System.out.println("seat left " +totalseat);
        }
        else{
            System.out.println("seat can not be booked");
            System.out.println("seat left "+ totalseat);
        }
    }
}

class yashbook extends Bookthreadseat
{
    static Bookthreadseat b;
    int seat;
    public void run()
    {
        b.Bookseat(seat);
    }

    public static void main(String[] args) {
        b = new Bookthreadseat();
        yashbook yk = new yashbook();
        yk.seat = 5;
        yk.Bookseat(5);

    }
}