class Trie {
    
    class TrieNode{
        boolean isLeafNode;
        char value;
        int weight;
        TrieNode[] children = new TrieNode[27];
        
        TrieNode(char value){
            this.value = value;
            this.isLeafNode = false;
            this.weight = -1;
        }
        
        public void setIsLeafNode(boolean isLeafNode){
            this.isLeafNode = isLeafNode;
        }
    }
    
    TrieNode root;
    
    /** Initialize your data structure here. */
    public Trie() {
       root = new TrieNode(' ');
    
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word, int weight) {
        TrieNode current = root;
        for(char c : word.toCharArray()){
            int index = (c=='#')? 26: c-'a';
            if(null==current.children[index]){
                current.children[index] = new TrieNode(c);
            }
            current =  current.children[index] ;
            if(current.weight==-1)
                current.weight = weight;
        }
        current.setIsLeafNode(true);
    }
    
    public int find(String op,String word){
        TrieNode current = root;
        for(char c : word.toCharArray()){
            int index = (c=='#')? 26: c-'a';
            if(null!=current.children[index] && current.children[index].value == c){
                current = current.children[index];
            }else{
                //return false;
                return -1;
            }
        }
        //return op.equals("search")? current.isLeafNode : true;
        return current.weight;
    }
    
    /** Returns if the word is in the trie. */
    public int search(String word) {
        return find("search",word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public int startsWith(String prefix) {
       return find("pre",prefix);
    }
}
class WordFilter {
    Trie theTrie = new Trie();
    
    
    public WordFilter(String[] words) {
        for(int i=words.length-1;i>=0;i--){
            String wordIns = "#"+words[i];
            theTrie.insert(wordIns,i);
            char[] charsArr = words[i].toCharArray();
            for(int j=charsArr.length-1;j>=0;j--){
                wordIns = charsArr[j]+wordIns;
                theTrie.insert(wordIns,i);
            }
        }
      
    }
    
    public int f(String prefix, String suffix) {
        
       // System.out.println(theTrie.startsWith(suffix+"#"+prefix));
        return theTrie.startsWith(suffix+"#"+prefix);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */