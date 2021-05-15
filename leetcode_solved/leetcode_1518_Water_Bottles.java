// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Water Bottles.
// Memory Usage: 35.3 MB, less than 98.59% of Java online submissions for Water Bottles.
// 略.
// T:O(log numE(numB)), S:O(1)
// 
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ret = 0;
        ret += numBottles;
        if (numBottles < numExchange) {
            return ret;
        }
        int emptyBottles = numBottles;
        do {
            ret += emptyBottles / numExchange;
            emptyBottles = (emptyBottles / numExchange) + emptyBottles % numExchange;
        } while (emptyBottles >= numExchange);
        return ret;
    }
}