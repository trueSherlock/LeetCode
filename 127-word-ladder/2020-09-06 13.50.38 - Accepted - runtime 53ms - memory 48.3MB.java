class Solution {
    private class Tuple{
        String word;
        int level;

        public Tuple(String word, int level) {
            this.word = word;
            this.level = level;
        }

        public String getWord() {
            return word;
        }

        public int getLevel() {
            return level;
        }     
    }
    Map<String,List<String>> formWordsMap;
    Map<String,Set<String>> wordFormsMap;
    Map<String,List<String>> adjList = new HashMap<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //intermediary state to words mapping
        formWordsMap = new HashMap<>();
        //store all intermediary forms of a word
        wordFormsMap = new HashMap<>(); 

        wordList.forEach(w->{
            String wordForm;
            for(int i=0;i<w.length();i++){
                wordForm = w.substring(0, i)+"*"+w.substring(i+1);
                formWordsMap.computeIfAbsent(wordForm, k->new LinkedList<>()).add(w);
                wordFormsMap.computeIfAbsent(w, k->new HashSet<>()).add(wordForm);
            }
        });

        //System.out.println(formWordsMap);
        //System.out.println(wordFormsMap);
        return bfs(beginWord,endWord);
    }

    private int bfs(String src,String dest){
        Deque<Tuple> queue = new ArrayDeque<>();
        Set<String> visited = new LinkedHashSet<String>();
        visited.add(src);
        for(int i=0;i<src.length();i++){
            String srcWordForm = src.substring(0, i)+"*"+src.substring(i+1);
            wordFormsMap.computeIfAbsent(src, k->new HashSet<>()).add(srcWordForm);
        }
        int level = 1;
        queue.offer(new Tuple(src,level));
        while(!queue.isEmpty()){
            Tuple cur = queue.poll();
            if(cur.getWord().equals(dest)) {
                //System.out.println(visited);
                return cur.getLevel();
            }
            wordFormsMap.get(cur.getWord()).forEach(inWord->{
                if(formWordsMap.containsKey(inWord)) {
                    formWordsMap.get(inWord).forEach(nextWord->{
                        if(!visited.contains(nextWord)){
                            queue.offer(new Tuple(nextWord,cur.getLevel()+1));
                            visited.add(nextWord);
                        }
                    });
                }
            });
        }  
        return 0;
    }
}