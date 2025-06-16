public class LeetcodeQ13 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3,3};
        int result =findDuplicate(nums);
        System.out.println("Duplicate number is: " + result);}
    static int findDuplicate(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            if (nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex); // Swap the current element with the element at its correct index
            } else {
                i++; // Move to the next element only if the current element is in its correct position
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j]; // Return the duplicate number
            }
        }
        return -1; // If no duplicate is found, return -1 (this case should not happen for valid input)
    }
    static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i]= nums[correctIndex];
        nums[correctIndex] = temp;
    }
}