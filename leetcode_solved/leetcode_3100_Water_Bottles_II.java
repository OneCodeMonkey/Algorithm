// Runtime 0 ms Beats 100.00% of users with Java
// Memory 41.04 MB Beats 23.84% of users with Java
// Implementation.
// T:O( n / m), S:O(1)
// 
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ret = numBottles, curEmpty = numBottles, cur = 0;
        while (cur + curEmpty >= numExchange) {
            ret++;
            curEmpty += cur;
            cur = 1;
            curEmpty -= numExchange;
            numExchange++;
        }

        return ret;
    }
}
