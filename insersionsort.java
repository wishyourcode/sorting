import java.util.Arrays;
public class insersionsort {
    public static void main(String[] args) {
        int[] arr = { -5, -14, 0, 5, 2, 9, 1, -95, 1, 6 };
        insertion_Sort(arr);
        System.out.println("Sorted array: " +Arrays.toString(arr));
    }

    static void insertion_Sort(int[] arr) {
       for (int i =0; i<arr.length-1; i++){
        for (int j =i+1;j >0; j-- ){
            if (arr[j]< arr[j-1]){
                // Swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            } else {
                break; // If the current element is in the correct position, break the inner loop
            }
        }
       }
    }
}
