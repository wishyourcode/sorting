import java.util.ArrayList;
import java.util.List;
public class LeetCodeQ14 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3,4, 4, 2};
        List<Integer> result = findDuplicates(nums);
        System.out.println("Duplicate numbers are: " + result);
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for (int j =0; j< nums.length; j++){
            if(nums[j] != j+1){
                duplicates.add(nums[j]); // Collect the duplicate number
            }
        }
        return duplicates; // Return the list of duplicate numbers
    }

    static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
