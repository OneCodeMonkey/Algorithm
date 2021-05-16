// AC: Runtime: 5 ms, faster than 47.97% of Java online submissions for Robot Return to Origin.
// Memory Usage: 39.1 MB, less than 38.73% of Java online submissions for Robot Return to Origin.
// 略。
// T:O(n), S:O(n)
// 
class Solution {
    public boolean judgeCircle(String moves) {
        int countR = 0, countL = 0, countU = 0, countD = 0;
        // 比直接 string.charAt(i) 稍微快一点
        char[] arr = moves.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = Math.abs(countR - countL) + Math.abs(countU - countD);
            // 提前终止
            if (count > arr.length - i) {
                return false;
            }
            switch (arr[i]) {
                case 'R':
                    countR++;
                    break;
                case 'L':
                    countL++;
                    break;
                case 'U':
                    countU++;
                    break;
                case 'D':
                    countD++;
                    break;
                default:
            }
        }
        if (countR != countL || countU != countD) {
            return false;
        }
        return true;
    }
}