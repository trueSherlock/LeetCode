class Solution {
     public int countElements(int[] arr) {
        Set<Integer> hashSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        long ctr = Arrays.stream(arr).filter(x -> hashSet.contains(x + 1)).boxed()
            .collect(Collectors.counting());
        return (int)ctr;
    }
}