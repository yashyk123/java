import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the number in array");
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the location ");
        int loc = sc.nextInt();
        for (int i = 0; i< size; i++) {
            

            if(number[i]==loc){
                System.out.println(loc+" prent in "+i);
            }
            else{
                System.out.println("element not present");
            }

        }

    }
}
