// Runtime 3 ms Beats 54.34% 
// Memory 44.87 MB Beats 20.27%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int ret = 0, base = 1;
        String[] arr1 = startTime.split(":"), arr2 = endTime.split(":");
        for (int i = 2; i >= 0; i--) {
            ret += (Integer.parseInt(arr2[i]) - Integer.parseInt(arr1[i])) * base;
            base *= 60;
        }

        return ret;
    }
}
