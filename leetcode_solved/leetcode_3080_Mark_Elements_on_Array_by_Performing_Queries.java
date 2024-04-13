// Runtime 186 ms Beats 23.74% of users with Java
// Memory 74.91 MB Beats 28.83% of users with Java
// Heap: or in java is PriorityQueue.
// T:O(nlogn), S:O(n + m)
// 
class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        // notice if number same, we will first choose the smaller index to mark,
        // So the comparator is `o1[0] - o2[0] == 0 ? (o1[1] - o2[1]) : o1[0] - o2[0]`;
        Queue<Integer[]> queue = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0] == 0 ? (o1[1] - o2[1]) : o1[0] - o2[0];
            }
        });
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            queue.offer(new Integer[]{nums[i], i});
        }

        long[] ret = new long[queries.length];
        HashSet<Integer> markedIndexes = new HashSet<>();
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0], markCount = queries[i][1];
            if (!markedIndexes.contains(index)) {
                markedIndexes.add(index);
                sum -= nums[index];
            }
            while (markCount > 0 && !queue.isEmpty()) {
                Integer[] elem = queue.poll();
                if (markedIndexes.contains(elem[1])) {
                    continue;
                }
                sum -= elem[0];
                markedIndexes.add(elem[1]);
                markCount--;
            }
            ret[i] = sum;
        }

        return ret;
    }
}
