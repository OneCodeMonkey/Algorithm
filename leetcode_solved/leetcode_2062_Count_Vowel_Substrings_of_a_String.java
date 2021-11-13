// AC: Runtime: 145 ms, faster than 33.33% of Java online submissions for Count Vowel Substrings of a String.
// Memory Usage: 39.2 MB, less than 83.33% of Java online submissions for Count Vowel Substrings of a String.
// brute-force
// T:O(n^3), S:O(n),
// 
class Solution {
    public int countVowelSubstrings(String word) {
        int size = word.length(), ret = 0;
        if (size >= 5) {
            HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            for (int i = 0; i <= size - 5; i++) {
                for (int j = i + 5; j <= size; j++) {
                    HashSet<Character> temp = new HashSet<>();
                    boolean flag = true;
                    for (int k = i; k < j; k++) {
                        if (!vowel.contains(word.charAt(k))) {
                            flag = false;
                            break;
                        }
                        temp.add(word.charAt(k));
                    }
                    if (flag && temp.size() == 5) {
                        ret++;
                    }
                }
            }
        }

        return ret;
    }
}