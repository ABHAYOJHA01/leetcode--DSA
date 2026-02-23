class Solution {
    public boolean isBalanced(String num) {
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(i%2==0){
                evensum = evensum+digit;

            }else{
                oddsum=oddsum+digit;
            }
        }
        return evensum==oddsum;
    }
}