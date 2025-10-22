class Solution {
    public int findComplement(int num) {
       
        if (num == 0) return 1;

        
        int bitLength = 0;
        int temp = num;
        while (temp > 0) {
            bitLength++;
            temp >>= 1;
        }

    
        int bitmask = (1 << bitLength) - 1;

       
        return num ^ bitmask;
    }
}
