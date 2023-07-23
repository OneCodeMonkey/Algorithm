// AC: Runtime 86 ms Beats 60% 
// Memory 46.6 MB Beats 100%
// Sort.
// T:O(n), S:O(n)
// 
class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        HashSet<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        StringBuilder ret = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (vowelSet.contains(s.charAt(i))) {
                vowels.add(s.charAt(i));
            }
        }
        if (!vowels.isEmpty()) {
            Collections.sort(vowels);
            int idx = 0;
            for (int i = 0; i < len; i++) {
                if (vowelSet.contains(s.charAt(i))) {
                    ret.append(vowels.get(idx++));
                } else {
                    ret.append(s.charAt(i));
                }
            }

            return ret.toString();
        }

        return s;
    }
}
