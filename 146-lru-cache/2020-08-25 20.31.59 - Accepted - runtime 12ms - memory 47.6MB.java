class LRULinkedMap<K,V> extends LinkedHashMap<K,V> {
    private static final long serialVersionUID = 1L;
    private int capacity;

    public LRULinkedMap(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K,V> eldest) {
       // System.out.println("Map:"+this);
        /*if(this.size()>capacity){
            remove(eldest.getKey());
           // System.out.println("After remove Map:"+this);
        }*/
        return this.size()>capacity;
    }

    

}
class LRUCache{
    public LRULinkedMap<Integer,Integer> cache;

    public LRUCache(int capacity) {
        cache = new LRULinkedMap<Integer,Integer>(capacity);
    }

    public int get(final int key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        return -1;
    }

    public void put(final int key, final int value) {
        cache.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */