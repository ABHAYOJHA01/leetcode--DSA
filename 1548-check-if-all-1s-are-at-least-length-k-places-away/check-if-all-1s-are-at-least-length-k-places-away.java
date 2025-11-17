class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int index = -1;  
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {

                if (index != -1 && i - index - 1 < k) {
                    return false;
                }

                index = i; 
            }
        }

        return true;
    }
}
