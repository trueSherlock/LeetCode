class Trie {
    
    class TrieNode{
        boolean isLeafNode;
        char value;
        TrieNode[] children = new TrieNode[26];
        
        TrieNode(char value){
            this.value = value;
            this.isLeafNode = false;
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
    public void insert(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(null==current.children[c-'a']){
                current.children[c-'a'] = new TrieNode(c);
            }
            current =  current.children[c-'a'] ;
        }
        current.setIsLeafNode(true);
    }
    
    public boolean find(String op,String word){
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(null!=current.children[c-'a'] && current.children[c-'a'].value == c){
                current = current.children[c-'a'];
            }else{
                return false;
            }
        }
        return op.equals("search")? current.isLeafNode : true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return find("search",word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
       return find("pre",prefix);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */