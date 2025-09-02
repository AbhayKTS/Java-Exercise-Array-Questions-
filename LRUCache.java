/*
 Exercise 5: LRU Cache (LinkedHashMap)
Use LinkedHashMap with access-order = true to simulate an LRU cache.
 */
public class LRUCache {
    private final int capacity;
    private final java.util.LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new java.util.LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        System.out.println(lruCache.get(1)); 
        lruCache.put(4, 40);
        System.out.println(lruCache.get(2)); 
        lruCache.put(5, 50); 
        System.out.println(lruCache.get(3)); 
        System.out.println(lruCache.get(4)); 
        System.out.println(lruCache.get(5)); 
    }
} 