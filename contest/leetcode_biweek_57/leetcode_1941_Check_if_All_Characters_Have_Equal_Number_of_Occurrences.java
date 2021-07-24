class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c: s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        int time = 0;
        for (char c: record.keySet()) {
            if (time == 0) {
                time = record.get(c);
            } else {
                if (record.get(c) != time) {
                    return false;
                }
            }
        }

        return true;
    }
}