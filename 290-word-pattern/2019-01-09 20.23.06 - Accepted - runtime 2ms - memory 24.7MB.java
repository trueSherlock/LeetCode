class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(strings.length!=pattern.length())
            return false;
        Map map = new HashMap();
        for(Integer i=0;i<strings.length;i++){
           if( map.put(strings[i],i)!=map.put(pattern.charAt(i),i))
               return false;
        }
        return true;
    }
}