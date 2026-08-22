// Runtime 37 ms Beats 53.21% 
// Memory 47.76 MB Beats 78.83%
// Map & Sort.
// T:O(n), S:O(n)
// 
class Solution {
    public String sortVowels(String s) {
        LinkedHashMap<Character, Integer> countChar = new LinkedHashMap<>();
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (char c : s.toCharArray()) {
            if (vowel.contains(c)) {
                countChar.merge(c, 1, Integer::sum);
            }
        }
        if (vowel.isEmpty()) {
            return s;
        }

        int[][] sortChar = new int[countChar.size()][2];
        int pos = 0;
        for (char c : countChar.keySet()) {
            int count = countChar.get(c);
            sortChar[pos++] = new int[]{(int) (c - 'a'), count};
        }
        StringBuilder ret = new StringBuilder();
        Arrays.sort(sortChar, Comparator.comparingInt(a -> -a[1]));
        for (int i = 0; i < s.length(); i++) {
            if (vowel.contains(s.charAt(i))) {
                for (int[] item : sortChar) {
                    if (item[1] > 0) {
                        ret.append((char) (item[0] + 'a'));
                        item[1]--;
                        break;
                    }
                }
            } else {
                ret.append(s.charAt(i));
            }
        }

        return ret.toString();
    }
}
