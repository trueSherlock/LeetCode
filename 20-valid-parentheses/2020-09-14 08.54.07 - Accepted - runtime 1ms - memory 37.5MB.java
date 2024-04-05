class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character,Character> comp = Map.of(
           '{','}',
           '[',']',
           '(',')');
        
        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }else if(stack.isEmpty() || c!=comp.get(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}