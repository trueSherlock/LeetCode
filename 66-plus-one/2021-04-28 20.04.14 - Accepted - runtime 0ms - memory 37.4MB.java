class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1,tempsum=0;
        for(int i=digits.length-1;i>=0 && carry!=0;i--){
            tempsum = digits[i]+carry;
            digits[i]=tempsum%10;
            carry = tempsum/10;
        }
        if(carry>0){
            int[] newDig = new int[digits.length+1];
            newDig[0]=carry;
            System.arraycopy(digits,0,newDig,1,digits.length);
            return newDig;
        }
        return digits;
    }
}