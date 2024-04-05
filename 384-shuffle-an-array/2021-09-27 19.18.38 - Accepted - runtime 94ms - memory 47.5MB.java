class Solution {

    private int[] orig;
    private int[] soln;
    Random rand = new Random();
    public Solution(int[] nums) {
        soln = nums;
        orig = nums.clone();
        
        
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return orig;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int cur=0;cur<orig.length;cur++){
            int randIdx = rand.ints(cur,orig.length).findFirst().getAsInt();
            swap(cur,randIdx);
        }
        return soln;
        
    }
    
    private void swap(int i, int j){
        int temp = soln[i];
        soln[i]=soln[j];
        soln[j]=temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */