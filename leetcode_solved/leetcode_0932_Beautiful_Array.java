// AC: Runtime: 4 ms, faster than 44.60% of Java online submissions for Beautiful Array.
// Memory Usage: 42 MB, less than 12.22% of Java online submissions for Beautiful Array.
// one construct way that meets the requirement of the problem says.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> record = new ArrayList<>();
        record.add(1);
        while(record.size() < n) {
            List<Integer> temp = new ArrayList<>();
            for (int i: record) {
                if (2 * i - 1 <= n) {
                    temp.add(2 * i - 1);
                }
            }
            for (int i:record) {
                if (2 * i <= n) {
                    temp.add(2 * i);
                }
            }
            record = temp;
        }
        return record.stream().mapToInt(e -> e).toArray();
    }
}