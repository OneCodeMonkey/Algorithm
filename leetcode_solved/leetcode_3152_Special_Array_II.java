// Runtime 47 ms Beats 50.00% of users with Java
// Memory 107.06 MB Beats 100.00% of users with Java
// Binary Search(Or using Treemap Data struct)
// T:O(m * logn), S:O(n)
//
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int len = nums.length, from = -1, to = -1;
        List<List<Integer>> segment = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) % 2 == 1) {
                if (from == -1) {
                    from = i;
                    to = i + 1;
                } else {
                    to = i + 1;
                }
                if (i == len - 2) {
                    segment.add(Arrays.asList(from, to));
                }
            } else {
                if (from != -1) {
                    segment.add(Arrays.asList(from, to));
                    from = -1;
                    to = -1;
                }
            }
        }
        TreeMap<Integer, Integer> segmentRecord = new TreeMap<>();
        for (List<Integer> segmentItem : segment) {
            segmentRecord.put(segmentItem.get(0), segmentItem.get(1));
        }

        boolean[] ret = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            from = queries[i][0];
            to = queries[i][1];
            // special condition: from == to
            if (from == to) {
                ret[i] = true;
                continue;
            }
            Integer key = segmentRecord.floorKey(from);
            if (key == null) {
                ret[i] = false;
            } else {
                ret[i] = segmentRecord.get(key) >= to;
            }
        }

        return ret;
    }
}
