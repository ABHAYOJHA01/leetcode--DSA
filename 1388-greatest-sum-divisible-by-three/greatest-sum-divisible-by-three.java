class Solution {
    public int maxSumDivThree(int[] nums) {
        
        Integer[][] memo = new Integer[nums.length][3];

        return helper(nums,0,0,memo);
    }

    static int helper(int[] nums,int i,int sum,Integer[][] memo){
          
          if (i == nums.length) return sum == 0 ? 0 : Integer.MIN_VALUE;
          
          if(memo[i][sum] != null) return memo[i][sum];

          int left =nums[i]+ helper(nums,i+1,(sum+nums[i])%3,memo);
          int right =helper(nums,i+1,sum,memo);

           return memo[i][sum] = Math.max(left, right);

    }
}