class Solution {
    public int maxSumDivThree(int[] nums) {

        Integer[][] memo = new Integer[nums.length][3];
        return helper(nums,0,0,memo);
    }

   static int helper(int[] nums,int i,int sumMod, Integer[][] memo){

        if (i == nums.length) return sumMod == 0 ? 0 : Integer.MIN_VALUE;

        if (memo[i][sumMod] != null) return memo[i][sumMod];

          int take = nums[i] + helper(nums, i+1, (sumMod + nums[i]) % 3, memo);
          int skip = helper(nums, i+1, sumMod, memo);

         return memo[i][sumMod] = Math.max(take, skip);
    }
}