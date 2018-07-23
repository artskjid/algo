package joka.artskjid.algo;

public class RemoveDuplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[len - 1]) {
                nums[len] = nums[i];
                len++;
            }

        }

        return len;
    }
}
