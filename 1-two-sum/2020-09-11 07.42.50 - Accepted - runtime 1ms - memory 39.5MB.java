class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> theMap = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int comp= target - numbers[i];
            if(theMap.containsKey(comp)) 
                return new int[]{i,theMap.get(comp)};
            else
                theMap.put(numbers[i],i);
            
        }
        throw new IllegalArgumentException("No two sum Error");
    }
}