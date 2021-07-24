// AC: Runtime: 11 ms, faster than 24.40% of Java online submissions for Design a Stack With Increment Operation.
// Memory Usage: 40.6 MB, less than 28.33% of Java online submissions for Design a Stack With Increment Operation.
// using a arrayList to implement stack's funcs
// T:O(1) & O(k), S:O(n)
// 
class CustomStack {
    private List<Integer> record;
    private final int maxListSize;

    public CustomStack(int maxSize) {
        maxListSize = maxSize;
        record = new ArrayList<>();
    }

    public void push(int x) {
        if (record.size() < maxListSize) {
            record.add(x);
        }
    }

    public int pop() {
        return record.isEmpty() ? -1 : record.remove(record.size() - 1);
    }

    public void increment(int k, int val) {
        for (int i = 0; i <= Math.min(k - 1, record.size() - 1); i++) {
            record.set(i, record.get(i) + val);
        }
    }
}