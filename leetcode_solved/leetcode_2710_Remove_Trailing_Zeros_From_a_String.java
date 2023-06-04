// AC: Runtime 4 ms Beats 50% 
// Memory 44 MB Beats 12.50%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder ret = new StringBuilder();
        boolean flag = true;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                flag = false;
            }
            if (flag) {
                continue;
            }
            ret.append(num.charAt(i));
        }

        return ret.reverse().toString();
    }
}
