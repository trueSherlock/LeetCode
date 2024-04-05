class Solution {
    
    /*
    
            4
        6       7
    7
    
    
    */
    
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        
        getSequences(nums,new LinkedList<Integer>(),res,0);
        return res;
    }
    
    public void getSequences(int[] nums, LinkedList<Integer> list, List<List<Integer>> res, int startIdx){
        if(list.size()>1){
                res.add(new LinkedList(list));
            }
        Set<Integer> seen = new HashSet<>();
        for(int i=startIdx;i<nums.length;i++){
            if(seen.contains(nums[i])) continue;
            if(list.size()==0 || nums[i]>=list.peekLast()){
                list.add(nums[i]);
                seen.add(nums[i]);
                getSequences(nums,list,res,i+1);
                list.removeLast();
            }
        }
    }
    
    
    
}