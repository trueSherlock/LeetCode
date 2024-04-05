class Solution {
    public boolean isHappy(int n) {
        Set<Integer> buffer = new HashSet<>();
        int curSum = 0;
        int curNum = n;
        while(curSum!=1){
            curSum = 0;
            while(curNum>0){
                curSum+=(curNum%10)*(curNum%10);
                curNum = curNum/10;
            }
           
            //System.out.println(curNum+":"+curSum);
            if(buffer.contains(curSum)) return false;
            buffer.add(curSum);
            curNum = curSum;
        }
        return true;
    }
}