// AC: Runtime: 10 ms, faster than 56.54% of Java online submissions for Queries on a Permutation With Key.
// Memory Usage: 40.4 MB, less than 5.86% of Java online submissions for Queries on a Permutation With Key.
// .
// T:O(k * O(logn)) - O(k * O(n)) , S:O(n), k = queries.length, n = m
// 
class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> p = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            p.add(i);
        }
        List<Integer> placed = new ArrayList<>();
        HashSet<Integer> placedSet = new HashSet<>();
        int[] ret = new int[queries.length];
        int pos = 0;
        for (int query: queries) {
            if (placedSet.contains(query)) {
                int index = placed.indexOf((Integer)query);
                ret[pos++] = index;
                placed.remove((Integer) query);
                placed.add(0, query);
            } else {
                int index = Collections.binarySearch(p, query);
                ret[pos++] = placed.size() + index;
                p.remove((Integer) query);
                placed.add(0, query);
                placedSet.add(query);
            }
        }

        return ret;
    }
}