class MinStack {

    Node head;
    
    /** initialize your data structure here. */
    public MinStack() {
     
       
    }
    
    public void push(int x) {
        if(head==null){
            head = new Node(x,x);
        }else{
            head = new Node(x,Math.min(head.min,x),head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
class Node{
    int val;
    int min;
    Node next;
    
    Node(int val,int min){
        this.val = val;
        this.min = min;
    }
    
    Node(int val,int min,Node next){
        this(val,min);
        this.next = next;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */