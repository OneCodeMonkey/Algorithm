// AC: Runtime 0 ms Beats 100% 
// Memory 42.5 MB Beats 100%
// Check by a while loop.
// T:O(n), S:O(1)
// 
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ret = 0, len = words.length;
        int left = startIndex, right = startIndex;
        boolean flag = false;
        while (ret <= len / 2) {
            if (words[left].equals(target) || words[right].equals(target)) {
                flag = true;
                break;
            }
            left = (left - 1 + len) % len;
            right = (right + 1) % len;
            ret++;
        }

        return flag ? ret : -1;
    }
}
