// AC: Runtime 0 ms Beats 100% 
// Memory 42.5 MB Beats 100%
// Check by a while loop.
// T:O(n), S:O(1)
// 
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ret = 0, len = words.length;
        if (words[startIndex].equals(target)) {
            return ret;
        }
        int left = (startIndex - 1 + len) % len, right = (startIndex + 1) % len;
        ret++;
        boolean flag = false;
        while (ret <= len / 2) {
            if (words[left].equals(target) || words[right].equals(target)) {
                flag = true;
                break;
            }
            ret++;
        }

        return flag ? ret : -1;
    }
}
