// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Student Attendance Record I.
// Memory Usage: 37.3 MB, less than 37.04% of Java online submissions for Student Attendance Record I.
// 略。
// T:O(n), S:O(1)
// 
class Solution {
    public boolean checkRecord(String s) {
        int ACount = 0, LConsecutiveMax = 0, LTempCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    ACount++;
                    LTempCount = 0;
                    if (ACount > 1) {
                        return false;
                    }
                    break;
                case 'L':
                    LTempCount++;
                    if (LTempCount > LConsecutiveMax) {
                        LConsecutiveMax = LTempCount;
                        if (LConsecutiveMax > 2) {
                            return false;
                        }
                    }
                    break;
                default:
                    LTempCount = 0;
            }
        }
        return true;
    }
}