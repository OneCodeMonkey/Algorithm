// Solution 1: Two Hashmap + N double-linked lists. Using `LinkedHashSet()` to simplify double-linked list.
// Runtime 75 ms Beats 27.03%
// Memory 142.30 MB Beats 5.38%
// Two Hashmap + N double-linked lists.
// T:O(1), S:O(1)
// 
class LFUCache {
    HashMap<Integer, Integer> countTime;
    HashMap<Integer, Integer> keyToValue;
    HashMap<Integer, LinkedHashSet<Integer>> timeToKeys;
    int maxCapacity;
    int curMinTime = -1;

    public LFUCache(int capacity) {
        countTime = new HashMap<>();
        keyToValue = new HashMap<>();
        timeToKeys = new HashMap<>();
        maxCapacity = capacity;
    }

    public int get(int key) {
        if (!keyToValue.containsKey(key)) {
            return -1;
        }
        int count = countTime.get(key);
        countTime.put(key, count + 1);
        timeToKeys.get(count).remove(key);
        if (count == curMinTime && timeToKeys.get(count).size() == 0) {
            curMinTime += 1;
        }
        if (!timeToKeys.containsKey(count + 1)) {
            timeToKeys.put(count + 1, new LinkedHashSet<>());
        }
        timeToKeys.get(count + 1).add(key);

        return keyToValue.get(key);
    }

    public void put(int key, int value) {
        if (maxCapacity <= 0) {
            return;
        }
        if (keyToValue.containsKey(key)) {
            keyToValue.put(key, value);
            get(key);
            return;
        }
        if (keyToValue.size() >= maxCapacity) {
            int removeElem = timeToKeys.get(curMinTime).iterator().next();
            timeToKeys.get(curMinTime).remove(removeElem);
            keyToValue.remove(removeElem);
        }
        keyToValue.put(key, value);
        countTime.put(key, 1);
        curMinTime = 1;
        timeToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>());
        timeToKeys.get(1).add(key);
    }
}


// Solution 2: Raw implementation with double-linked lists.
// todo