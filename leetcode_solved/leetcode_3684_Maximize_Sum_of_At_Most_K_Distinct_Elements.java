// Runtime 8 ms Beats 100.00% 
// Memory 45.12 MB Beats 100.00%
// Min Heap.
// O(n + nlogk), S:O(n) ~ O(k)
// 
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> record = new HashSet<>();
        for (int i : nums) {
            record.add(i);
        }
        PriorityQueue<Integer> topK = new PriorityQueue<>();
        for (int i : record) {
            if (topK.size() < k) {
                topK.offer(i);
            } else {
                if (topK.peek() < i) {
                    topK.poll();
                    topK.offer(i);
                }
            }
        }

        int pos = 0;
        int[] retArr = new int[topK.size()];
        while (!topK.isEmpty()) {
            retArr[retArr.length - 1 - pos++] = topK.poll();
        }

        return retArr;
    }
}
