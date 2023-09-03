// AC: Runtime 1 ms Beats 100%
// Memory 41.7 MB Beats 50%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char c1 = s1.charAt(0), c2 = s1.charAt(1), c3 = s1.charAt(2), c4 = s1.charAt(3), c5 = s2.charAt(0),
                c6 = s2.charAt(1), c7 = s2.charAt(2), c8 = s2.charAt(3);
        return ((c1 == c5 && c3 == c7) || (c1 == c7 && c3 == c5)) && ((c2 == c6 && c4 == c8) || (c2 == c8 && c4 == c6));
    }
}
