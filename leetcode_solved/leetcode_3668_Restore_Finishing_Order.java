// Runtime 2 ms Beats 70.46% 
// Memory 45.02 MB Beats 68.83%
// Set.
// T:O(m + n), S:O(n)
// 
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friendSet = new HashSet<>();
        for (int friend : friends) {
            friendSet.add(friend);
        }
        int[] ret = new int[friends.length];
        int pos = 0;
        for (int i : order) {
            if (friendSet.contains(i)) {
                ret[pos++] = i;
            }
        }

        return ret;
    }
}
