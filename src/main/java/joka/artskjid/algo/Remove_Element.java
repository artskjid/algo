package joka.artskjid.algo;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length;
        while (i < j) {

            while (i < j && nums[i] != val) i++;
            while (i < j && nums[j - 1] == val) j--;

            if (i < j) {
                nums[i] = nums[j - 1];
                j--;
            }
        }

        return j;
    }
}
