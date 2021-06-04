// AC:
// Runtime: 19 ms, faster than 53.32% of Java online submissions for Number of Recent Calls.
// Memory Usage: 47.4 MB, less than 64.82% of Java online submissions for Number of Recent Calls.
// 思路：用queue维护
// T:O(1), S:O(n)
//
class RecentCounter {
    private int count;
    private Queue<Integer> record = new LinkedList<>();

    public RecentCounter() {
        this.count = 0;
    }

    public int ping(int t) {
        record.offer(t);
        if (!record.isEmpty()) {
            while (record.peek() != null && t - record.peek() > 3000) {
                record.poll();
            }
        }
        return record.size();
    }
}