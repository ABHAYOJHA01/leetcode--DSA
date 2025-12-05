class Solution {
    public int countPartitions(int[] nums) {

        int n = nums.length;
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int left = 0;

        int count = 0;

        for (int k = 0; k < n - 1; k++) {

            left += nums[k];
            int right = total - left;

            int ans = Math.abs(right - left);

            if (ans % 2 == 0) count++;
        }

        return count;
    }
}
