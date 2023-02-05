// AC: Runtime 5 ms Beats 100% 
// Memory 41.8 MB Beats 100%
// Max heap.
// T:O((k + n) * logn), S:O(n), n = gifts.length
// 
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(gifts.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int gift : gifts) {
            maxHeap.offer(gift);
        }
        for (int i = 0; i < k; i++) {
            int top = maxHeap.peek();
            if (top == 1) {
                break;
            }
            maxHeap.poll();
            maxHeap.offer((int) Math.sqrt(top));
        }
        long ret = 0;
        while (!maxHeap.isEmpty()) {
            ret += maxHeap.poll();
        }

        return ret;
    }
}
