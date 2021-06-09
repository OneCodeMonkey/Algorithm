// AC: Runtime: 25 ms, faster than 8.94% of Java online submissions for Find the Town Judge.
// Memory Usage: 47.9 MB, less than 20.09% of Java online submissions for Find the Town Judge.
// hashmap
// T:O(n), S:O(n), n is the trust's length.
// 
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0) {
            return n == 1 ? 1 : -1;
        }
        HashMap<Integer, HashSet<Integer>> record = new HashMap<>();
        HashMap<Integer, Integer> trustCount = new HashMap<>();
        for (int[] item: trust) {
            if (record.get(item[1]) == null) {
                HashSet<Integer> temp = new HashSet<>();
                temp.add(item[0]);
                record.put(item[1], temp);
            } else {
                record.get(item[1]).add(item[0]);
            }
            trustCount.merge(item[0], 1, Integer::sum);
        }
        int judge = -1;
        for (int i: record.keySet()) {
            if (record.get(i).size() == n - 1) {
                judge = i;
                break;
            }
        }
        // judge dont trust others
        if (judge == -1 || trustCount.get(judge) != null) {
            return -1;
        }

        return judge;
    }
}