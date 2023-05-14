// AC: Runtime 1 ms Beats 75% 
// Memory 42.2 MB Beats 25%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int countSeniors(String[] details) {
        int ret = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                ret++;
            }
        }

        return ret;
    }
}
