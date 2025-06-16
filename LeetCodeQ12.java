import java.util.ArrayList;
import java.util.List;
public class LeetCodeQ12 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> missingNumbers = findDisappearedNumbers(nums);
        System.out.println("Missing numbers are: " + missingNumbers);
        
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
       int i =0;
        while(i <nums.length){
            int correctIndex = nums[i]-1; // Calculate the correct index for the current element
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex); // Swap the current element with the element at its correct index
            } else {
                i++; // Move to the next element only if the current element is in its correct position
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j =0; j<nums.length; j++){
            if(nums[j] != j+1){ // Check if the value at index j is not equal to j+1
              ans.add(j+1); // Return the missing number as a list
            }
        }
        return ans; // Return the list of missing numbers
    }
    static void sort(int[] nums){
        
    }
    static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
