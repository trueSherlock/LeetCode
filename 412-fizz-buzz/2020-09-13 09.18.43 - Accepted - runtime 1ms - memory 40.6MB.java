class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        for(int i=1;i<=n;i++){
            output.add(
                (i%15==0) ? "FizzBuzz":
                            (i%3==0)?"Fizz":
                                (i%5==0)?"Buzz":
                                    String.valueOf(i));
            
        }
        return output;
    }
}