class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n / 2; i++) {
            int sum = nums[i] + nums[n - 1 - i];
            set.add(sum);
        }
        return set.size();
    }
}