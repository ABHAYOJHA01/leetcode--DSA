class Solution {
    public int specialTriplets(int[] nums) {
        final long MOD = 1_000_000_007L;
        int maxVal = 200_000; 

        long[] left = new long[maxVal + 1];
        long[] right = new long[maxVal + 1];

        
        for (int x : nums) {
            right[x]++;
        }

        long ans = 0;

        for (int x : nums) {
            right[x]--;  

            int target = x * 2;
            if (target <= maxVal) {
                ans = (ans + left[target] * right[target]) % MOD;
            }

            left[x]++;    
        }

        return (int) ans;
    }
}
