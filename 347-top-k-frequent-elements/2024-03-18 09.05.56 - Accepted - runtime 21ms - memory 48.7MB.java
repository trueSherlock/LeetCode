class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = Arrays.stream(nums).boxed().collect(
            Collectors.groupingBy(Function.identity(),Collectors.summingInt(n->1)));
        List<Integer> sortList = freqMap.keySet().stream().sorted((n1,n2)->freqMap.get(n2)-freqMap.get(n1)).toList();
        return sortList.stream().limit(k).mapToInt(i->i).toArray();
    }
}