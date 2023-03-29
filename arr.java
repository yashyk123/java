import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int a[] = { 10, 40, 20, 70, 30, 50 };
        System.out.println(a.length);
        System.out.println("Without sort");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("With sort");
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
