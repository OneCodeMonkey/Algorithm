// AC: Runtime: 1 ms, faster than 44.31% of Java online submissions for Verifying an Alien Dictionary.
// Memory Usage: 39.3 MB, less than 7.92% of Java online submissions for Verifying an Alien Dictionary.
// simple java hashmap recording the order, and then compare the adjacent strings one letter by one.
// T:O(n), S:O(1)
//.
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            int c = order.charAt(i) - 'a';
            record.put(c, i);
        }
        record.put(-1, -1);

        for (int i = 0; i < words.length - 1; i++) {
            int maxLen = Math.max(words[i].length(), words[i + 1].length());
            for (int j = 0; j < maxLen; j++) {
                int c1 = j < words[i].length() ? (words[i].charAt(j) - 'a') : -1;
                int c2 = j < words[i + 1].length() ? (words[i + 1].charAt(j) - 'a') : -1;
                if (record.get(c1) < record.get(c2)) {
                    break;
                }
                if (record.get(c1) > record.get(c2)) {
                    return false;
                }
            }
        }
        return true;
    }
}