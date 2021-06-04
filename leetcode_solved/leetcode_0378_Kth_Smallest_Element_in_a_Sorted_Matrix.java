// AC: Runtime: 14 ms, faster than 56.61% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
// Memory Usage: 43.5 MB, less than 91.24% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
// priority queue
// T:O(m * n * logk), S:O(k)
// 
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length, col = matrix[0].length;
        PriorityQueue<Integer> record = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                record.offer(matrix[i][j]);
                if (record.size() > k) {
                    record.poll();
                }
            }
        }

        if (record.isEmpty()) {
            return 0;
        }

        return record.peek();
    }
}