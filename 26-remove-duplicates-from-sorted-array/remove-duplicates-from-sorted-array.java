class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int cm= 1;
        int res=1;
        int n= nums.length;
        while(cm<n){
            if(nums[cm]==nums[officer]){
                cm++;
                continue;
            }
            else{
                nums[officer+1]=nums[cm];
                officer++;
                res++;
                cm++;

            }
            
        }
        return res;
        

    }
}