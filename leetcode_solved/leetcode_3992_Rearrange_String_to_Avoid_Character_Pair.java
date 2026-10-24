// Runtime 3 ms Beats ?? % 
// Memory 45.12 MB Beats ?? %
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String rearrangeString(String s, char x, char y) {
        String ans = "";
        StringBuilder ret = new StringBuilder();
        int count1 = 0, count2 = 0;
        for (char c : s.toCharArray()) {
            if (c != x && c != y) {
                ret.append(c);
            } else if (c == x) {
                count1++;
            } else {
                count2++;
            }
        }
        ans = ret.toString();
        ans = ans + String.valueOf(y).repeat(count2) + String.valueOf(x).repeat(count1);

        return ans;
    }
}
