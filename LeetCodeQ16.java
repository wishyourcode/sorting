public class LeetCodeQ16 {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        int result = firstMissingPositive(nums);
        System.out.println("The first missing positive number is: " + result);
        
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i]<= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j=0; j< nums.length; j++){
            if (nums[j] != j + 1) {
                return j + 1; // Return the first missing positive number
            }
        }
        return nums.length;// If no error is found, return -1 for both (this case should not happen for valid input)
    }
    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
