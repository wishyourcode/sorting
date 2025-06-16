public class bubblesort {

    public static void main(String[] args) {
        int[] arr = { -5, -14, 0, 5, 2, 9, 1, -95, 1, 6 };
        bubble_Sort(arr);
        System.out.println("Sorted array:" + java.util.Arrays.toString(arr));
    }

    static void bubble_Sort(int[] arr) {
        boolean isSorted = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSorted = true;
                }
                if (!isSorted) {
                    break; // If no swaps were made, the array is sorted
                }
            }
        }
    }
    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
    }
}