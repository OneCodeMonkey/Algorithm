// AC: Runtime: 8 ms, faster than 44.48% of Java online submissions for Bulls and Cows.
// Memory Usage: 38.9 MB, less than 79.81% of Java online submissions for Bulls and Cows.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length(), retA = 0, retB = 0;
        // record the unmatched letter
        HashMap<Character, Integer> recordA = new HashMap<>();
        HashMap<Character, Integer> recordB = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char c1 = secret.charAt(i), c2 = guess.charAt(i);
            if (c1 == c2) {
                retA++;
            } else {
                recordA.merge(c1, 1, Integer::sum);
                recordB.merge(c2, 1, Integer::sum);
            }
        }
        for (char c: recordA.keySet()) {
            if (recordB.containsKey(c)) {
                retB += Math.min(recordA.get(c), recordB.get(c));
            }
        }

        return retA + "A" + retB + "B";
    }
}