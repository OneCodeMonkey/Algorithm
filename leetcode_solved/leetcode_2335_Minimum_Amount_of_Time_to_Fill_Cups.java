// AC: Runtime: 2 ms, faster than 55.56% of Java online submissions for Minimum Amount of Time to Fill Cups.
// Memory Usage: 42 MB, less than 55.56% of Java online submissions for Minimum Amount of Time to Fill Cups.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);

        if (amount[2] - amount[1] >= amount[0]) {
            return amount[2];
        } else {
            return amount[0] + (int) Math.ceil((amount[2] + amount[1] - amount[0]) / 2.0);
        }
    }
}