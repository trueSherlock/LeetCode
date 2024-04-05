class Solution {
    public boolean rotateString(String A, String B) {
        String testStr = A;
        if(testStr.equals(B)) return true;
        for(int i = 0; i<A.length();i++){
            testStr = rotateIt(testStr);
            if(testStr.equals(B)) return true;
        }
        return false;
    }
    
    public String rotateIt(String s){
        return s.substring(1)+s.charAt(0);
    }
}