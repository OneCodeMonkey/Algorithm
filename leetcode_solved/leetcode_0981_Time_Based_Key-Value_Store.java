// AC: Runtime: 140 ms, faster than 70.24% of Java online submissions for Time Based Key-Value Store.
// Memory Usage: 117.2 MB, less than 68.09% of Java online submissions for Time Based Key-Value Store.
// hashmap and binary search.
// set(), get(): T:O(logn), S:O(logn), n is the key count of same keyName.
// 
class TimeMap {
    HashMap<String, TreeMap<Integer, String>> record;

    public TimeMap() {
        record = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (record.containsKey(key)) {
            record.get(key).put(timestamp, value);
        } else {
            TreeMap<Integer, String> tempTreeMap = new TreeMap<>();
            tempTreeMap.put(timestamp, value);
            record.put(key, tempTreeMap);
        }
    }

    public String get(String key, int timestamp) {
        if (record.containsKey(key)) {
            Map.Entry<Integer, String> point = record.get(key).floorEntry(timestamp);
            return point == null ? "" : point.getValue();
        }

        return "";
    }
}