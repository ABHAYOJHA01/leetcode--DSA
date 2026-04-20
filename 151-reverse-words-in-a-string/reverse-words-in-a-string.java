class Solution {
    public String reverseWords(String s) {
      String[] w=s.trim().split("\\s+");
      StringBuilder ans= new StringBuilder();
      for(int i= w.length-1;i>=0;i--){
        ans.append(w[i]);
        if(i!=0){
            ans.append(" ");
        }
      }
        return ans.toString();
    }
}