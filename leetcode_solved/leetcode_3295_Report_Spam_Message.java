// Runtime 45 ms Beats 100.00%
// Memory 85.18 MB Beats 100.00%
// Set.
// T:O(n), S:O(m)
// 
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        boolean ret = false;
        HashSet<String> bannedWordSet = new HashSet<>(Arrays.asList(bannedWords));
        int count = 0;
        for (String item : message) {
            if (bannedWordSet.contains(item)) {
                count++;
                if (count >= 2) {
                    ret = true;
                    break;
                }
            }
        }

        return ret;
    }
}
