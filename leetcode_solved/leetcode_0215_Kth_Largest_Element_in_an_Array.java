// AC: Runtime: 4 ms, faster than 59.49% of Java online submissions for Kth Largest Element in an Array.
// Memory Usage: 39.4 MB, less than 40.77% of Java online submissions for Kth Largest Element in an Array.
// using max heap to record the largest k elements.
// T:O(n * logk), S:O(k)
// 
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> record = new PriorityQueue<>(k);
        for (int i: nums) {
            record.offer(i);
            if (record.size() > k) {
                record.poll();
            }
        }
        if (record.size() == 0) {
            return -1;
        }
        return record.peek();
    }
}