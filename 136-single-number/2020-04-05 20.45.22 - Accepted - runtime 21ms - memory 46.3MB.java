class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> tracker = new HashSet<>();
        for(int n:nums){
            if(tracker.contains(n)){
                tracker.remove(n);
            }else{
                tracker.add(n);
            }
        }
        return tracker.iterator().next();
    }
}