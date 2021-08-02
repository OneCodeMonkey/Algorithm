// AC: Runtime: 16 ms, faster than 22.78% of Java online submissions for Palindrome Partitioning.
// Memory Usage: 63.3 MB, less than 22.41% of Java online submissions for Palindrome Partitioning.
// backtracking
// T:O(2^(n - 1), S:O(n * 2^(n - 1))
// 
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new LinkedList<>();
        backtracking(s, 0, new LinkedList<>(), ret, 0);

        return ret;
    }

    private void backtracking(String s, int curLen, List<String> path, List<List<String>> out, int startIndex) {
        List<String> pathCopy = new LinkedList<>(path);
        if (curLen >= s.length()) {
            out.add(pathCopy);
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s.substring(startIndex, i + 1))) {
                pathCopy.add(s.substring(startIndex, i + 1));
                curLen += i - startIndex + 1;
                backtracking(s, curLen, pathCopy, out, i + 1);
                curLen -= i - startIndex + 1;
                pathCopy.remove(pathCopy.size() - 1);
            } else {
                continue;
            }
        }
    }

    private boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}