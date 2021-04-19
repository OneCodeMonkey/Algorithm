// AC:
// Runtime: 1 ms, faster than 36.83% of Java online submissions for Kids With the Greatest Number of Candies.
// Memory Usage: 38.9 MB, less than 58.87% of Java online submissions for Kids With the Greatest Number of Candies.
// 思路：略
// 复杂度：T:O(n), S:O(1)
// 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int size = candies.length, max = candies[0];
        List<Boolean> ret = new LinkedList<>();
        for (int i = 1; i < size; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (candies[i] + extraCandies >= max) {
                ret.add(true);
            } else {
                ret.add(false);
            }
        }
        return ret;
    }
}