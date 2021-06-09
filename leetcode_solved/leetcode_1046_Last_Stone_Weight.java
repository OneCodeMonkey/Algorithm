// AC: Runtime: 4 ms, faster than 6.54% of Java online submissions for Last Stone Weight.
// Memory Usage: 38 MB, less than 10.70% of Java online submissions for Last Stone Weight.
// using priority queue to simulate the procedure
// T: O(n), S:O(n)
//
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesRecord = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i: stones) {
            stonesRecord.add(i);
        }
        while (true) {
            if (stonesRecord.size() < 2) {
                return stonesRecord.size() == 1 ? stonesRecord.poll() : 0;
            }
            int i1 = stonesRecord.poll();
            int i2 = stonesRecord.poll();
            if (i1 != i2) {
                stonesRecord.offer(i1 - i2);
            }
        }
    }
}