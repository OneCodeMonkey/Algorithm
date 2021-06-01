// AC: Runtime: 21 ms, faster than 94.62% of Java online submissions for Distribute Candies.
// Memory Usage: 41.1 MB, less than 52.11% of Java online submissions for Distribute Candies.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int distributeCandies(int[] candyType) {
        int size = candyType.length;
        HashSet<Integer> record = new HashSet<>();
        for (int i: candyType) {
            record.add(i);
            if (record.size() >= size / 2) {
                return size / 2;
            }
        }

        return Math.min(size / 2, record.size());
    }
}