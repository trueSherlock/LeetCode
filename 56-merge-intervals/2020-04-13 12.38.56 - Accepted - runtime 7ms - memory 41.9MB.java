class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval : intervals) {
            if(merged.isEmpty() || interval[0]>merged.getLast()[1]) {
                merged.add(interval);
            }else{
                if(merged.getLast()[1]<interval[1]){ //end time for new interval more
                    //expand interval
                    merged.getLast()[1] = interval[1];
                }
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}