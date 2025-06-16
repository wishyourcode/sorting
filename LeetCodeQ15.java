public class LeetCodeQ15 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 6, 5};
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate number is: " + result[0]);
        System.out.println("Missing number is: " + result[1]);

    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j=0; j< nums.length; j++){
            if (nums[j] != j + 1) {
                return new int[]{nums[j], j + 1}; // Return the duplicate and missing number
            }
        }
        return new int[]{-1, -1}; // If no error is found, return -1 for both (this case should not happen for valid input)
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}