class MedianFinder {

    
    PriorityQueue<Integer> minHeap; //larger half seen so far
    PriorityQueue<Integer> maxHeap; //smaller half seen so far
    int size=0;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if(minHeap.isEmpty()){
            minHeap.offer(num);
        }else {
            if(num>=minHeap.peek()){
                minHeap.offer(num);
            }else{
                maxHeap.offer(num);
            }
        }

        if(minHeap.size()>maxHeap.size()+1){
            maxHeap.offer(minHeap.poll());
        }else if(maxHeap.size()>minHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if((minHeap.size()+maxHeap.size())%2==0){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }else{
            return minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */