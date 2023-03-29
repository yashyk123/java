import java.util.*;
public class arrmutli {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[][]arr=new int[size][size];
        int[][]arr1=new int[size][size];
        int[][]res=new int[size][size];

        System.out.println("Enter the element in array arr");
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
 
        System.out.println("Enter the element in array arr1");
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                res[i][j]=arr[i][j]*arr1[j][i];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
