import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] input = {5, 8, 11, 6, 2, 1, 7};
        
        int[] oddNumbers = new int[input.length / 2];
        int[] evenNumbers = new int[input.length - oddNumbers.length];
        
        int oddIndex = 0;
        int evenIndex = 0;
        
        for (int num : input) {
            if (num % 2 != 0) {
                oddNumbers[oddIndex] = num;
                oddIndex++;
            } else {
                evenNumbers[evenIndex] = num;
                evenIndex++;
            }
        }
        
        Arrays.sort(oddNumbers);
        
        for (int i = 0; i < evenNumbers.length / 2; i++) {
            int temp = evenNumbers[i];
            evenNumbers[i] = evenNumbers[evenNumbers.length - 1 - i];
            evenNumbers[evenNumbers.length - 1 - i] = temp;
        }
        
        int[] result = new int[input.length];
        System.arraycopy(oddNumbers, 0, result, 0, oddNumbers.length);
        System.arraycopy(evenNumbers, 0, result, oddNumbers.length, evenNumbers.length);

        System.out.println("Custom sorted array: " + Arrays.toString(result));
    }
}
