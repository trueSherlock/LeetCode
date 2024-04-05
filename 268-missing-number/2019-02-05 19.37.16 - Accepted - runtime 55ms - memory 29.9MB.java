class Solution {
    public int missingNumber(int[] nums){
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}