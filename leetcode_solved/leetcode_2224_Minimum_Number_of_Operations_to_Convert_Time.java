// AC: Runtime: 3 ms, faster than 25.00% of Java online submissions for Minimum Number of Operations to Convert Time.
// Memory Usage: 43 MB, less than 25.00% of Java online submissions for Minimum Number of Operations to Convert Time.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int convertTime(String current, String correct) {
        int currentMinute = 0, correctMinute = 0, ret = 0;
        String[] arr1 = current.split(":"), arr2 = correct.split(":");
        currentMinute = Integer.parseInt(arr1[0]) * 60 + Integer.parseInt(arr1[1]);
        correctMinute = Integer.parseInt(arr2[0]) * 60 + Integer.parseInt(arr2[1]);

        int diff = currentMinute <= correctMinute ? correctMinute - currentMinute : (60 * 24 - correctMinute + currentMinute);
        while (diff > 0) {
            for (int i : Arrays.asList(60, 15, 5, 1)) {
                if (diff / i >= 1) {
                    ret += diff / i;
                    diff -= diff / i * i;
                    break;
                }
            }
        }

        return ret;
    }
}
