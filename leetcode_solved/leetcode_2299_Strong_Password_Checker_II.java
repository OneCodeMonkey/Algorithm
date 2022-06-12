// AC: Runtime: 4 ms, faster than 6.98% of Java online submissions for Strong Password Checker II.
// Memory Usage: 41.9 MB, less than 58.14% of Java online submissions for Strong Password Checker II.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        HashSet<Character> characters = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        boolean hasLowercaseLetter = false, hasUppercaseLetter = false, hasDigit = false, hasCharacter = false;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (i < password.length() - 1 && password.charAt(i) == password.charAt(i + 1)) {
                    return false;
                }
                if (!hasLowercaseLetter && c >= 'a' && c <= 'z') {
                    hasLowercaseLetter = true;
                }
                if (!hasUppercaseLetter && c >= 'A' && c <= 'Z') {
                    hasUppercaseLetter = true;
                }
                if (!hasDigit && c >= '0' && c <= '9') {
                    hasDigit = true;
                }
                if (!hasCharacter && characters.contains(c)) {
                    hasCharacter = true;
                }
            }
            return hasLowercaseLetter && hasUppercaseLetter && hasDigit && hasCharacter;
        }
        return false;
    }
}