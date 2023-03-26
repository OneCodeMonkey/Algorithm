// AC: Runtime 3 ms Beats 99.95% 
// Memory 41.9 MB Beats 55.51%
// Discussion with different type.
// T:O(1), S:O(1)
// 
class Solution {
    public int distMoney(int money, int children) {
        int ret = -1;
        if (money < children || (money == 4 && children == 1)) {
            return ret;
        }

        int remain = money - children;
        if (remain == 7 * children) {
            ret = children;
        } else if (remain > 7 * children) {
            ret = children - 1;
        } else {
            int distEight = remain / 7, left = remain - 7 * distEight;
            if (distEight == children - 1 && left == 3) {
                ret = children - 2;
            } else {
                ret = distEight;
            }
        }

        return ret;
    }
}
