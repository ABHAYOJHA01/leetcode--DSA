class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){

            sum =sum+ nums[right];

            while(sum >= target){
                minLen = Math.min(minLen, right -i + 1);
                sum = sum-nums[i];
                i++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}