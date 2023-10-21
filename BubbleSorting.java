import java.util.Arrays;
import java.util.Scanner;
public class BubbleSorting {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number of the Element in Array: ");
        int n = Sc.nextInt();

        int[] arr = new int[n];
                System.out.println("Enter the Element in Array: ");

    for (int i = 0; i < n; i++) {
       
            arr[i] = Sc.nextInt();

   
    }

    Arrays.sort(arr);
for (int i : arr) {
    System.out.print(i+" ");
}

    }
}
