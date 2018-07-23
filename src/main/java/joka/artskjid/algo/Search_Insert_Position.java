package joka.artskjid.algo;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] >= target) {
                return i;
            }

            i++;
        }

        return i;
    }
}
