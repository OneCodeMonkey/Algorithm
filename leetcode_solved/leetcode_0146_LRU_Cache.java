// AC: Runtime: 46 ms, faster than 89.97% of Java online submissions for LRU Cache.
// Memory Usage: 109.2 MB, less than 87.04% of Java online submissions for LRU Cache.
// implement with java's native LinkedHashMap container.
// T:O(1), S:O(n)
//
class LRUCache {
    private HashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}