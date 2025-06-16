public class LeetcodeQ11 {
    public static void main(String[] args) {
        int[] arr= { 3, 1 };
        missingNumber(arr);
        System.out.println("Missing number is: " + missingNumber(arr));
    }
    static int missingNumber(int [] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if (arr[i]<arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex); // Swap the current element with the element at its correct index
            } else {
                i++; // Move to the next element only if the current element is in its correct position
            }
        }
        // After sorting, the missing number will be the first index where the value does not match the index
        for (int j =0; j < arr.length; j++){
            if(arr[j] != j){
                return j; // Return the index where the value does not match the index
            }
        }
        // If all indices match, the missing number is the last index
        return arr.length; // This means the missing number is the length of the array
    }
    static void swap(int[] arr, int i, int correctIndex) {
        int temp =arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
        }
}
