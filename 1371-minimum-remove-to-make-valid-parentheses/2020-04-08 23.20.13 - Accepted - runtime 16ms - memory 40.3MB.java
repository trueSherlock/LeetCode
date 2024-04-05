class Solution {
    public String minRemoveToMakeValid(String s) {
        //Integer[] tuple = new int[2]{idx,0-(, )};
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> wrongParenIdx = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else if(ch==')'){
                if(!stack.isEmpty())
                    stack.pop();
                else
                    wrongParenIdx.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        wrongParenIdx.forEach(x->sb.setCharAt(x,'#'));
        stack.forEach(x->sb.setCharAt(x,'#'));
        return sb.toString().replaceAll("#","");
    }
}