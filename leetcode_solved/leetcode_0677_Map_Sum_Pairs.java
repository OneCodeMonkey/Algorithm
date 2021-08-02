// AC: Runtime: 11 ms, faster than 93.31% of Java online submissions for Map Sum Pairs.
// Memory Usage: 39.1 MB, less than 40.83% of Java online submissions for Map Sum Pairs.
// hashmap
// T:O(n * strlen(prefix)), S:O(n)
// 
class MapSum {
    private HashMap<String, Integer> record;

    /** Initialize your data structure here. */
    public MapSum() {
        record = new HashMap<>();
    }

    public void insert(String key, int val) {
        record.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String key: record.keySet()) {
            if (key.startsWith(prefix)) {
                sum += record.get(key);
            }
        }
        
        return sum;
    }
}