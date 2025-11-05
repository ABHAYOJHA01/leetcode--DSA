class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n=cardPoints.length;
      int leftsum =0;
      int rightsum=0;
      for(int i=0;i<k;i++){
        leftsum+=cardPoints[i];
      }
      int result =leftsum;
      for(int i=0;i<k;i++){
        leftsum-=cardPoints[k-i-1];
        rightsum+=cardPoints[n-i-1];
        result =Math.max(result,leftsum+rightsum);

        
      }
      return result;
    
    }
}