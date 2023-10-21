import java.util.Scanner;

public class SumOfArray
{
   static int getSum(int[] arr, int index){

       if(index==0)
         return arr[index];

       return arr[index] + getSum(arr, index-1);
   }
   public static void main(String args[])
   {

      int arr[] = {12, 13, 1, 10, 34, 10};

      int n = arr.length;
      System.out.print("Sum of Given Array is "+getSum(arr, n-1)); 
   }
}