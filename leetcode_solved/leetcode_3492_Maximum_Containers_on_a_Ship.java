// Runtime 0 ms Beats 100.00% 
// Memory 40.98 MB Beats 65.69%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n * n, maxWeight / w);
    }
}
