// Runtime 2 ms Beats 100.00% of users with Java
// Memory 42.95 MB Beats 100.00% of users with Java
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int findPermutationDifference(String s, String t) {
        int ret = 0;
        HashMap<Character, Integer> charIndexOfS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charIndexOfS.putIfAbsent(s.charAt(i), i);
        }
        for (int i = 0; i < t.length(); i++) {
            ret += Math.abs(i - charIndexOfS.get(t.charAt(i)));
        }

        return ret;
    }
}
