// AC: Runtime: 15 ms, faster than 83.70% of Java online submissions for Kth Largest Element in a Stream.
// Memory Usage: 44.7 MB, less than 23.62% of Java online submissions for Kth Largest Element in a Stream.
// using priority
// T:O(n), S:O(k)
// 
class KthLargest {
    private PriorityQueue<Integer> descQueue = new PriorityQueue<>();
    private int classK = 0;

    public KthLargest(int k, int[] nums) {
        classK = k;
        for (int i: nums) {
            descQueue.offer(i);
            if (descQueue.size() > k) {
                descQueue.poll();
            }
        }
    }

    public int add(int val) {
        descQueue.offer(val);
        if (descQueue.size() > classK) {
            descQueue.poll();
        }
        return descQueue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */