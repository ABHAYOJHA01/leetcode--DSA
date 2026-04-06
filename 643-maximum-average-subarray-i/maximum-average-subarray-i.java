class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
     
        int sum=0;
        int n= nums.length;
      
        for(int i=low;i<=high;i++){
            sum=(sum+nums[i]);
        }
           int res=sum;
        while(high<n){
            res= Math.max(res,sum);
            high++;
            if(high==n){
                break;
            }
            sum=(sum+nums[high]);
            sum=(sum-nums[low]);
            low++;
        }
        return (double) res/k;
    }
}