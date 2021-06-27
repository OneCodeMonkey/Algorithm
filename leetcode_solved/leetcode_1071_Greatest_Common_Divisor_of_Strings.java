// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Greatest Common Divisor of Strings.
// Memory Usage: 39.2 MB, less than 27.18% of Java online submissions for Greatest Common Divisor of Strings.
// thoughts: like integer's GCD algorithm
// T:O(max(len(str1), len(str2))), S:O(1)
// 
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int size1 = str1.length(), size2 = str2.length();
        if (size1 < size2) {
            return gcdOfStrings(str2, str1);
        }

        return size1 == size2 ? (str1.equals(str2) ? str1 : "") : (str1.startsWith(str2) ? gcdOfStrings(str2, str1.substring(str2.length())) : "");
    }
}