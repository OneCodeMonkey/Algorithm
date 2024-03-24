// Runtime 2 ms Beats 100.00% of users with Java
// Memory 44.36 MB Beats 100.00% of users with Java
// Combination.
// T:O(n), S:O(1)
// 
class Solution {
    public long countSubstrings(String s, char c) {
        int countOccurence = 0;
        for (char c1 : s.toCharArray()) {
            if (c1 == c) {
                countOccurence++;
            }
        }

        return (long) countOccurence * (countOccurence + 1) / 2;
    }
}
