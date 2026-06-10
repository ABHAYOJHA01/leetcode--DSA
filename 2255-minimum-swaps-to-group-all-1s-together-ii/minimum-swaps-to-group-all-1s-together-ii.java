class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }
        if (totalOnes <= 1) return 0;
        int currentOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }
        int maxOnes = currentOnes;
        for (int i = totalOnes; i < n + totalOnes - 1; i++) {
            if (nums[(i - totalOnes) % n] == 1) {
                currentOnes--;
            }
            if (nums[i % n] == 1) {
                currentOnes++;
            }
            maxOnes = Math.max(maxOnes, currentOnes);
        }
        return totalOnes - maxOnes;
    }
}