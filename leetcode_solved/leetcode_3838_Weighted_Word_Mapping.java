// Runtime 2 ms Beats 97.44% 
// Memory 46.70 MB Beats 60.56%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ret = new StringBuilder();
        for (String word : words) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            ret.append((char) (25 - sum % 26 + 'a'));
        }

        return ret.toString();
    }
}
