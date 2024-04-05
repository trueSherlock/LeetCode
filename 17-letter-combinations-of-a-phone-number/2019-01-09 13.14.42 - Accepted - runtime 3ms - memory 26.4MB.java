class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> results = new LinkedList<>();
        String[] map = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()>0){
            results.push("");
            while(results.peek().length()<digits.length()){
                String remove = results.remove();
                for(char x:map[digits.charAt(remove.length())-'0'].toCharArray()){
                    results.addLast(remove + x);
                }

            }
        }
        return results;
    }
}