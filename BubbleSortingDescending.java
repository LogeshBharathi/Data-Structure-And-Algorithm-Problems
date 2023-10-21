import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BubbleSortingDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Integer[] numbers = new Integer[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Sorted numbers in descending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();

    }
}
