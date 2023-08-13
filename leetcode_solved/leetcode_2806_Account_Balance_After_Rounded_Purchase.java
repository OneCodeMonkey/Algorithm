// AC: Runtime 0 ms Beats 100%
// Memory 38.9 MB Beats 100%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (purchaseAmount % 10 >= 5 ? (purchaseAmount / 10 + 1) * 10 : purchaseAmount / 10 * 10);
    }
}
