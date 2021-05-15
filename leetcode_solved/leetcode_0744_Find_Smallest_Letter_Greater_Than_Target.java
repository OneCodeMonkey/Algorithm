// AC:
// Runtime: 9 ms, faster than 7.34% of Java online submissions for Find Smallest Letter Greater Than Target.
// Memory Usage: 39.4 MB, less than 30.71% of Java online submissions for Find Smallest Letter Greater Than Target.
// .
// T: avg(O(logn)), maxO(n), S:O(1)
//
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int size = letters.length;
        if (target >= letters[size - 1] || target < letters[0]) {
            return letters[0];
        }
        // 二分法查找,缩小遍历范围
        int left = 0, right = size - 1, mid, equalIndex = -1;
        while (left < right) {
            System.out.println(left + " - " + right);
            mid = (left + right) / 2;
            if (letters[mid] == target) {
                equalIndex = mid;
                break;
            } else if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (equalIndex != -1) {
            while (letters[equalIndex] == target) {
                equalIndex++;
            }
            return letters[equalIndex];
        } else {
            if (letters[right] <= target) {
                while (letters[right] <= target) {
                    right++;
                }
                return letters[right];
            } else {
                while (letters[right] > target) {
                    right--;
                }
                return letters[right + 1];
            }
        }
    }
}