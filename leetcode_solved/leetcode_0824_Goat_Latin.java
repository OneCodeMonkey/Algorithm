// AC: Runtime: 3 ms, faster than 60.24% of Java online submissions for Goat Latin.
// Memory Usage: 37.5 MB, less than 76.95% of Java online submissions for Goat Latin.
// .
// T:O(n), S:O(n)
//
class Solution {
    public String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        StringBuilder ret = new StringBuilder();
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (int i = 0; i < split.length; i++) {
            StringBuilder temp = new StringBuilder(split[i]);
            if (!vowel.contains(split[i].charAt(0))) {
                temp.append(split[i].charAt(0));
                temp = new StringBuilder(temp.subSequence(1, temp.length()));
            }
            temp.append("ma");
            for (int j = 0; j < i + 1; j++) {
                temp.append('a');
            }
            ret.append(temp);
            ret.append(" ");
        }
        return ret.substring(0, ret.length() - 1);
    }
}