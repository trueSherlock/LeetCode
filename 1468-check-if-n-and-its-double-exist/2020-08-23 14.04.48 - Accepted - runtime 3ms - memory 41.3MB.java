class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> toCheck = new HashSet<>();
        for(int n:arr){
            if(toCheck.contains(2*n) || ((n%2==0) && toCheck.contains(n/2)))
                return true;
            toCheck.add(n);
        }
        return false;
    }
}