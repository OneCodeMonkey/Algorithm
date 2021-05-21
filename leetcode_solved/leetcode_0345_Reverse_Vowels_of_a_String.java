// AC
// 略
// T:O(n), S:O(n)
// 
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> vowelList = new Stack<>();
        StringBuilder ret = new StringBuilder();
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i))) {
                vowelList.add(s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i))) {
                ret.append(vowelList.pop());
            } else {
                ret.append(s.charAt(i));
            }
        }
        return ret.toString();
    }
}