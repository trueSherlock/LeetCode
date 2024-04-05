class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mySet = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> output = Arrays.stream(nums2).filter(mySet::contains).boxed().collect(Collectors.toSet());
        return output.parallelStream().mapToInt(Integer::intValue).toArray();
    }
}