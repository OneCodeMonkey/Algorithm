// AC: Runtime: 2 ms, faster than 99.58% of Java online submissions for Redistribute Characters to Make All Strings Equal.
// Memory Usage: 38.9 MB, less than 59.70% of Java online submissions for Redistribute Characters to Make All Strings Equal.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean makeEqual(String[] words) {
        int size = words.length;
        int[] record = new int[26];
        for (String str: words) {
            for (char c: str.toCharArray()) {
                int cToi = c - 'a';
                record[cToi]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (record[i] % size != 0) {
                return false;
            }
        }

        return true;
    }
}