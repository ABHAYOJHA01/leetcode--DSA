class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int x : nums) total += x;
        int need = (int)(total % p);
        if (need == 0) return 0;

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int ans = n;
        int cur = 0;

        for (int i = 0; i < n; ++i) {
            cur = (cur + nums[i]) % p;
            int target = (cur - need) % p;
            if (target < 0) target += p;

            if (map.containsKey(target)) {
                ans = Math.min(ans, i - map.get(target));
            }
            map.put(cur, i);
        }

        return ans == n ? -1 : ans;
    }
}
