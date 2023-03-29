import java.util.*;

public class largestarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the element in array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("check the largest element in array");

        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];        
            }
            

        }
        System.out.println(max);
    }
}
