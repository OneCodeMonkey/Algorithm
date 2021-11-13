// AC: Runtime: 8 ms, faster than 76.71% of Java online submissions for Check If a String Can Break Another String.
// Memory Usage: 40.1 MB, less than 64.38% of Java online submissions for Check If a String Can Break Another String.
// first sort, and compare each position, judge if all is >= or <=.
// T:O(nlogn), S:O(n)
//
class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        if (s1.length() < 2) {
            return true;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sign = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (sign == 0) {
                if (arr1[i] > arr2[i]) {
                    sign = 1;
                } else if (arr1[i] < arr2[i]) {
                    sign = -1;
                }
            } else {
                if (arr1[i] > arr2[i] && sign == -1) {
                    return false;
                } else if (arr1[i] < arr2[i] && sign == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}