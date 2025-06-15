public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        cyclic_Sort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    static void cyclic_Sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Calculate the correct index for the current element
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex); // Swap the current element with the element at its correct index
            } else {
                i++; // Move to the next element only if the current element is in its correct
                     // position
            }
        }
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
