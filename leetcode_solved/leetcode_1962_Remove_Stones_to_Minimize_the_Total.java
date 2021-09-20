// AC: Runtime: 798 ms, faster than 26.29% of Java online submissions for Remove Stones to Minimize the Total.
// Memory Usage: 123.2 MB, less than 19.36% of Java online submissions for Remove Stones to Minimize the Total.
// max-heap
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int minStoneSum(int[] piles, int k) {
        int size = piles.length, ret = 0;
        if (size < 1) {
            return 0;
        }
        PriorityQueue<Integer> record = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i: piles) {
            record.offer(i);
        }

        for (int i = 0; i < k; i++) {
            int t = record.peek();
            if (t == 1) {
                return 1 * record.size();
            }
            int t2 = t - (t / 2);
            record.poll();
            record.offer(t2);
        }

        while (!record.isEmpty()) {
            ret += record.poll();
        }

        return ret;
    }
}