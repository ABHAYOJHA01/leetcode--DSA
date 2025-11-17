class Solution {
    public int[] transformArray(int[] nums) {
          int n=nums.length;
        int[] arr= new int[n];
        int i=0;
      
        for(int nm: nums){
            if(nm%2==0){
             arr[i]=0;
             i++;
            }
            else{
                arr[i]=1;
                i++;
            }
        }
         Arrays.sort(arr);
        return arr;
    }
}