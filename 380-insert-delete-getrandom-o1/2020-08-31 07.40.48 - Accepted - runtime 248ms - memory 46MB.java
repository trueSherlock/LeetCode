class RandomizedSet {

    Set<Integer> storeSet;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        storeSet = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        return storeSet.add(val);
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return storeSet.remove(val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        Integer[] arr = storeSet.toArray(new Integer[0]);
        return arr[random.nextInt(storeSet.size())];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */