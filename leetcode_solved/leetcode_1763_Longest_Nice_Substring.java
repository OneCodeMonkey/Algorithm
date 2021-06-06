// solution 2: divider-conquer. thanks for https://leetcode.com/problems/longest-nice-substring/discuss/1074589/JavaStraightforward-Divide-and-Conquer
// AC: Runtime: 2 ms, faster than 92.31% of Java online submissions for Longest Nice Substring.
// Memory Usage: 39.1 MB, less than 50.87% of Java online submissions for Longest Nice Substring.
// thoughts: when meets character that can pair upcase and lowercase, dividing string by it, and judge substring.
// T:O(n^2), S:O(n)
// 
class Solution {
    public String longestNiceSubstring(String s) {
        int size = s.length();
        if (size < 2) {
            return "";
        }
        HashSet<Character> record = new HashSet<>();
        for (char c: s.toCharArray()) {
            record.add(c);
        }
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (record.contains(Character.toUpperCase(c)) && record.contains(Character.toLowerCase(c))) {
                continue;
            }
            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i + 1, size));
            return s1.length() >= s2.length() ? s1 : s2;
        }
        
        return s;
    }
}

// solution 1: since the s.length() <= 100, guess maybe brute-force can pass.
// AC: Runtime: 68 ms, faster than 12.06% of Java online submissions for Longest Nice Substring.
// Memory Usage: 39.3 MB, less than 30.94% of Java online submissions for Longest Nice Substring.
// checking throught all cases, brute-force method
// T:O(n^3), O:(n^2)
//
class Solution {
    public String longestNiceSubstring(String s) {
        int size = s.length(), maxLen = 0;
        List<String> ret = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (size - i <= maxLen) {
                break;
            }
            for (int j = size - 1; j >= 0; j--) {
                HashSet<Character> check = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    check.add(s.charAt(k));
                }
                boolean flag = true;
                for (char c: check) {
                    if (c >= 'a') {
                        if (!check.contains((char)(c - 32))) {
                            flag = false;
                            break;
                        }
                    } else {
                        if (!check.contains((char)(c + 32))) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        ret.add(s.substring(i, j + 1));
                    }
                    break;
                }
            }
        }
        for (String str: ret) {
            if (str.length() == maxLen) {
                return str;
            }
        }

        return "";
    }
}