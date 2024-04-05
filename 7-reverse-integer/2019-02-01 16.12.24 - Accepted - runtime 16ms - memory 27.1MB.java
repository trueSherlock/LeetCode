class Solution {
    public int reverse(int x) {
        boolean isNeg = (0>x);
        int tmp = Math.abs(x);
        int rev = 0;
        while(tmp>0){
            if(rev>(Integer.MAX_VALUE - (tmp % 10)) / 10) return 0;
            rev = (rev*10) + (tmp%10);
            tmp = tmp/10;
        }
        return isNeg?(0-rev):rev;
    }
}