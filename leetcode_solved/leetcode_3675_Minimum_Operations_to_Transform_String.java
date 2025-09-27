//  Runtime 25 ms Beats 100.00% 
// Memory 51.60 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(String s) {
        char target = 'z' + 1;
        boolean find = false;
        for (char c : s.toCharArray()) {
            if (c != 'a' && c < target) {
                target = c;
                if (!find) {
                    find = true;
                }
            }
        }
        return !find ? 0 : ('z' - target + 1);
    }
}
