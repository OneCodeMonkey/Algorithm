// AC: Runtime 3 ms Beats 94.83%
// Memory 43.4 MB Beats 74.14%
// When k==1, we can only rotate this string, compare the (len - 1) possible strings and find the lexicographical one,
// When k > 1, we can make all possible permutation of the original string chars (key: this can be proved).
// T:O(nlogn ~ n ^ 2), S:O(n)  n = s.length()
//
class Solution {
    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String cmp = s;
            int len = s.length();
            for (int i = 0; i + 1 < len; i++) {
                String newStr = s.substring(i + 1, len) + s.substring(0, i + 1);
                if (newStr.compareTo(cmp) < 0) {
                    cmp = newStr;
                }
            }
            return cmp;
        }
        char[] c = s.toCharArray();
        Arrays.sort(c);

        return new String(c);
    }
}
