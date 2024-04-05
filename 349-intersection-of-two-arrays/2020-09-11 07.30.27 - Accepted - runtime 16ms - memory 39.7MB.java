class Solution {
     public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Arrays.stream(nums1).forEach(x->res.add(x));

        res.retainAll(IntStream.of(nums2).boxed().collect(Collectors.toList()));
        return res.stream().mapToInt(i->i).toArray();
    }
}