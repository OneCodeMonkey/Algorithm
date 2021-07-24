// AC: Runtime: 429 ms, faster than 10.71% of Java online submissions for Design HashSet.
// Memory Usage: 47.4 MB, less than 47.27% of Java online submissions for Design HashSet.
// not very well.
// T: add|contains|remove: O(logn), S:O(n)
// 
class MyHashSet {
    private List<Integer> record;

    /** Initialize your data structure here. */
    public MyHashSet() {
        record = new ArrayList<>();
    }

    public void add(int key) {
        if (!contains(key)) {
            record.add(key);
            Collections.sort(record);
        }
    }

    public void remove(int key) {
        record.remove((Integer)key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return Collections.binarySearch(record, key) >= 0;
    }
}