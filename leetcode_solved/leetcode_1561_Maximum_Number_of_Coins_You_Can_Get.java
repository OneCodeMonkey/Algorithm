// AC: Runtime: 24 ms, faster than 97.63% of Java online submissions for Maximum Number of Coins You Can Get.
// Memory Usage: 48.9 MB, less than 31.42% of Java online submissions for Maximum Number of Coins You Can Get.
// Thought: First sort, then for every loop, you choose the (piles[n - 1], piles[n - 2], piles[0]), 
//  (piles[n - 3], piles[n - 4], piles[1]), ... you get piles[n - 2], piles[n - 4], ... , until finished.
// T:O(nlogn), S:O(logn),  logn is the system sort stack space cost.
// 
class Solution {
    public int maxCoins(int[] piles) {
        int size = piles.length, ret = 0;
        Arrays.sort(piles);
        for (int i = 1; i <= size / 3; i++) {
            ret += piles[size - 2 * i];
        }
        
        return ret;
    }
}