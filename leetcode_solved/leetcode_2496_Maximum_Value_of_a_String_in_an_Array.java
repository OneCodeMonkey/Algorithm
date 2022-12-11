// AC: Runtime 1 ms Beats 83.33% 
// Memory 40 MB Beats 83.33%
// .
// T:O(sum(strs[i].length)), S:O(max(strs[i].length))
// 
class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        for (String str : strs) {
            boolean isNumeric = true;
            for (char c : str.toCharArray()) {
                if (c < '0' || c > '9') {
                    maxVal = Math.max(maxVal, str.length());
                    isNumeric = false;
                    break;
                }
            }
            if (isNumeric) {
                maxVal = Math.max(maxVal, Integer.parseInt(str));
            }
        }

        return maxVal;
    }
}
