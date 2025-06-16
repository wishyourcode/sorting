public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = { -5, -14, 0, 5, 2, 9, 1, -95, 1, 6 };
        selection_sort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
    static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }
    static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
