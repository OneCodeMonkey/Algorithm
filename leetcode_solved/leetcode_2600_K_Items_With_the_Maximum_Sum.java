// AC: untime 1 ms Beats 100% 
// Memory 40.5 MB Beats 40%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return k <= (numOnes + numZeros) ? Math.min(k, numOnes) : (numOnes * 2 + numZeros - k);
    }
}
