class Solution {
    public int reverse(int x) {
        System.out.println(Integer.MAX_VALUE); System.out.println(Integer.MIN_VALUE);
        boolean isNeg = (0>x);
        int tmp = Math.abs(x);
        long rev = 0;
        while(tmp>0){
            rev = (rev*10) + (tmp%10);
            if(rev>Integer.MAX_VALUE) return 0;
            tmp = tmp/10;
        }
        return isNeg?(int)(0-rev):(int)rev;
    }
}