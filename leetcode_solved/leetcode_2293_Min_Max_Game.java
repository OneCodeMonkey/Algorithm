// AC: Runtime: 5 ms, faster than 25.00% of Java online submissions for Min Max Game.
// Memory Usage: 42 MB, less than 100.00% of Java online submissions for Min Max Game.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int minMaxGame(int[] nums) {
        List<Integer> record = new ArrayList<>(), recordNew;
        for (int i : nums) {
            record.add(i);
        }
        while (record.size() > 1) {
            recordNew = new ArrayList<>();
            for (int i = 0; i < (record.size() + 1) / 2; i++) {
                if (i % 2 == 0) {
                    recordNew.add(Math.min(record.get(2 * i), (2 * i + 1 < record.size() ? record.get(2 * i + 1) : record.get(2 * i))));
                } else {
                    recordNew.add(Math.max(record.get(2 * i), (2 * i + 1 < record.size() ? record.get(2 * i + 1) : record.get(2 * i))));
                }
            }
            record = new ArrayList<>(recordNew);
        }
        return record.get(0);
    }
}