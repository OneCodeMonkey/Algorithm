// AC: Runtime: 12 ms, faster than 97.80% of Java online submissions for First Bad Version.
// Memory Usage: 35.9 MB, less than 14.79% of Java online submissions for First Bad Version
// 注意踩坑，int 会超出范围
// T:O(logn), S:O(1)
//
public class Solution {
    public int firstBadVersion(int n) {
        int left = 1, right = n, count = 0;
        while (left < right) {
            // 这里是坑，直接（left + right）/ 2 会超出 int
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid) == false) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (isBadVersion(left) == false) {
            return left + 1;
        }
        return left;
    }
}