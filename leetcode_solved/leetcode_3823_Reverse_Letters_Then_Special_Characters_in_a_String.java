// Runtime 3 ms Beats 57.98% 
// Memory 46.35 MB Beats 34.24%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String reverseByType(String s) {
        List<Character> letters = new ArrayList<>(), nonLetter = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            } else {
                nonLetter.add(c);
            }
        }
        StringBuilder ret = new StringBuilder();
        int pos1 = 0, pos2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ret.append(letters.get(letters.size() - 1 - pos1));
                pos1++;
            } else {
                ret.append(nonLetter.get(nonLetter.size() - 1 - pos2));
                pos2++;
            }
        }

        return ret.toString();
    }
}
