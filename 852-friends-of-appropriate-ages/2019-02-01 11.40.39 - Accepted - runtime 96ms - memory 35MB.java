class Solution {
    public int numFriendRequests(int[] ages) {
        int fReqs = 0;
        Map<Integer,Long> ageMap = Arrays.stream(ages).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ageMap);

        Set<Integer> ageSet  = ageMap.keySet();

        for(Integer age:ageSet){
            for(Integer age2:ageSet){
                if((age2<=0.5*age+7) || age2>age || (age2 > 100 && age<100)){
                    continue;
                }
                //System.out.println(ages[a]+"-->"+ages[b]);
                if(age==age2)
                    fReqs+=ageMap.get(age)*(ageMap.get(age)-1);
                else
                    fReqs+=ageMap.get(age)*ageMap.get(age2);
            }
        }
        return fReqs;
    }
}