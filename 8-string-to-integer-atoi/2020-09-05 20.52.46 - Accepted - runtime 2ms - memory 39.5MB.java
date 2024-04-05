
class Solution {
    public int myAtoi(String str) {
        boolean isNeg=false;
        str=str.trim();
        int idx=0;
        int result =0,preResult=0;
        if(str.isBlank()) return result;
        if(str.charAt(0)=='-'){
            isNeg=true;
            idx++;
        }else if (str.charAt(0)=='+'){
            idx++;
        }
        for(;idx<str.length();idx++){
            char curChar = str.charAt(idx);
            if(!Character.isDigit(curChar)){
                return isNeg?(0-result):result;
            }
            result = (result*10)+(curChar-'0');
            if(preResult!=0 && !Integer.toString(result).startsWith(Integer.toString(preResult))){//overflow occurred
                return isNeg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }  
            preResult = result;
        }
        return isNeg?(0-result):result;
    }
}


