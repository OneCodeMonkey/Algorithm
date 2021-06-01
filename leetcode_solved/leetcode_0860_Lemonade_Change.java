// AC: Runtime: 2 ms, faster than 59.34% of Java online submissions for Lemonade Change.
// Memory Usage: 39.9 MB, less than 43.44% of Java online submissions for Lemonade Change.
// 记录 $5, $10 的个数即可
// T:O(n), S:O(1)
// 
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++;
            }
            if (bill == 10) {
                if (fiveCount < 1) {
                    return false;
                }
                tenCount++;
                fiveCount--;
            }
            if (bill == 20) {
                if (tenCount < 1) {
                    if (fiveCount < 3) {
                        return false;
                    }
                    fiveCount -= 3;
                } else {
                    if (fiveCount < 1) {
                        return false;
                    }
                    tenCount--;
                    fiveCount--;
                }
            }
        }
        return true;
    }
}