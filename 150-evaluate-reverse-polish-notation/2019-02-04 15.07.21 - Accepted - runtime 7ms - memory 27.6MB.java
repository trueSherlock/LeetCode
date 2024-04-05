class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        int result = 0,op1,op2;
        for(String t:tokens){
            //System.out.println(stack);
            switch(t){
                case "+" : 
                      op2 = stack.removeFirst();op1 = stack.removeFirst();
                      result =  op1 +  op2; 
                      stack.addFirst(result);break;
                case "-" : op2 = stack.removeFirst();op1 = stack.removeFirst();
                      result =  op1 -  op2;
                      stack.addFirst(result);break;
                case "*" : op2 = stack.removeFirst();op1 = stack.removeFirst();
                      result =  op1 * op2; 
                      stack.addFirst(result);break;
                case "/" : op2 = stack.removeFirst();op1 = stack.removeFirst();
                      result =  op1 / op2; 
                      stack.addFirst(result);break;
                default: stack.addFirst(Integer.parseInt(t));
            }
        }
        return stack.removeFirst();
    }
}