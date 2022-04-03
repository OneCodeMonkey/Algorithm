// AC: Runtime: 396 ms, faster than 50.00% of Java online submissions for Find Players With Zero or One Losses.
// Memory Usage: 144 MB, less than 100.00% of Java online submissions for Find Players With Zero or One Losses.
// treemap.
// T:(nlogn), S:O(n)
// 
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeMap<Integer, Integer> record = new TreeMap<>();
        List<List<Integer>> ret = new LinkedList<>();
        for (int[] match : matches) {
            if (!record.containsKey(match[0])) {
                record.put(match[0], 0);
            }
            record.merge(match[1], 1, Integer::sum);
        }
        List<Integer> allWin = new LinkedList<>(), loseExactlyOne = new LinkedList<>();
        for (int i : record.keySet()) {
            if (record.get(i) == 0) {
                allWin.add(i);
            } else if (record.get(i) == 1) {
                loseExactlyOne.add(i);
            }
        }
        ret.add(allWin);
        ret.add(loseExactlyOne);

        return ret;
    }
}