// AC: Runtime: 81 ms, faster than 8.39% of Java online submissions for Design an Ordered Stream.
// Memory Usage: 40.8 MB, less than 8.78% of Java online submissions for Design an Ordered Stream.
// using treemap, not very fast.
// T:O(n), S:O(n)
//
class OrderedStream {
    private TreeMap<Integer, String> record;

    public OrderedStream(int n) {
        record = new TreeMap<>();
    }

    public List<String> insert(int idKey, String value) {
        record.put(idKey, value);
        List<String> ret = new LinkedList<>();
        int idPos = 1, curRetIdKey = -1;
        for (int id: record.keySet()) {
            if (id != idPos) {
                return ret;
            }
            if (id == idKey) {
                curRetIdKey = id;
                ret.add(value);
            } else {
                if (!ret.isEmpty()) {
                    if (id - curRetIdKey == 1) {
                        curRetIdKey = id;
                        ret.add(record.get(id));
                    } else {
                        break;
                    }
                }
            }
            idPos++;
        }
        return ret;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */