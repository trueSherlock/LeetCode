import java.util.Optional;
class Solution {
   public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> valCtMap =
                IntStream.of(nums1).boxed().collect(Collectors.groupingBy(k->k,Collectors.summingInt(e->1)));
        Arrays.stream(nums2).forEach(n->{
            Optional<Integer> ct = Optional.ofNullable(valCtMap.computeIfPresent(n,(k,v)->v-1));
            if(ct.isPresent() && ct.get()>=0) output.add(n);
        });

        return output.stream().mapToInt(x->x).toArray();
    }
}