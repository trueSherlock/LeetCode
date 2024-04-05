class MyQueue {

    Deque<Integer> enq;
    Deque<Integer> deq;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        enq = new LinkedList<>();
        deq = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        enq.addFirst(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int ret;
        if(!deq.isEmpty()){
            ret = deq.removeFirst();
        }else{
            enqToDeq();
            ret =  deq.removeFirst();
        }
        return ret;
    }
    
    /** Get the front element. */
    public int peek() {
        if(!deq.isEmpty()){
            return deq.peekFirst();
        }else{
            enqToDeq();
            return deq.peekFirst();
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return enq.isEmpty() && deq.isEmpty();
    }
    
    private void enqToDeq(){
        while(!enq.isEmpty()){
            deq.addFirst(enq.removeFirst());
        } 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */