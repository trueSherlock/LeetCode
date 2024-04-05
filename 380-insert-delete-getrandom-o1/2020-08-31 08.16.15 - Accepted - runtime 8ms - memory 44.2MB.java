class RandomizedSet {

    List<Integer> store;
    Map<Integer,Integer> valStoreIdx;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
        store = new ArrayList<>();
        valStoreIdx = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(valStoreIdx.containsKey(val)) return false;
        valStoreIdx.put(val,store.size());
        store.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!valStoreIdx.containsKey(val)) return false;
        int idx = valStoreIdx.get(val);
        //swap with last idx if its not last
        if(idx!=store.size()-1){
            valStoreIdx.put(store.get(store.size()-1),idx);
            store.set(idx,store.get(store.size()-1));
        }
        store.remove(store.size()-1);
        valStoreIdx.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        return store.get(random.nextInt(store.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */