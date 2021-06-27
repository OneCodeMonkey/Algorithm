// AC: Runtime: 9 ms, faster than 13.81% of Java online submissions for Most Visited Sector in a Circular Track.
// Memory Usage: 39.4 MB, less than 24.69% of Java online submissions for Most Visited Sector in a Circular Track.
// .
// T:O(rounds.length * n), S:O(n)
// 
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        HashMap<Integer, Integer> record = new HashMap();
        List<Integer> ret = new ArrayList<>();
        int size = rounds.length, maxTime = 0;
        record.put(rounds[0], 1);
        for (int i = 0; i < size - 1; i++) {
            for (int j = rounds[i] + 1; j <= (rounds[i] < rounds[i + 1] ? rounds[i + 1] : (rounds[i + 1] + n)); j++) {
                record.merge(j <= n ? j : j - n, 1, Integer::sum);
            }
        }
        for (int i: record.keySet()) {
            maxTime = Math.max(maxTime, record.get(i));
        }
        for (int i: record.keySet()) {
            if (record.get(i) == maxTime) {
                ret.add(i);
            }
        }
        Collections.sort(ret);

        return ret;
    }
}