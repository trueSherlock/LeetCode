class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int comp= target - numbers[i];
            int idx = Arrays.binarySearch(numbers,i+1,numbers.length,comp);
            if(idx>0){
                return new int[]{i+1,idx+1};
            }
        }
        throw new IllegalArgumentException("No two sum Error");
    }
}