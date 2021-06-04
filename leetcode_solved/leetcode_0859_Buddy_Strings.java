// AC: Runtime: 3 ms, faster than 46.31% of Java online submissions for Buddy Strings.
// Memory Usage: 39 MB, less than 44.29% of Java online submissions for Buddy Strings.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() < 2 || s.length() != goal.length()) {
            return false;
        }
        int size = s.length();
        List<Integer> diffIndex = new LinkedList<>();
        HashSet<Character> record = new HashSet<>();
        boolean hasLetterTwice = false;
        for (int i = 0; i < size; i++) {
            if (record.contains(s.charAt(i))) {
                hasLetterTwice = true;
            } else {
                record.add(s.charAt(i));
            }
            if (s.charAt(i) != goal.charAt(i)) {
                diffIndex.add(i);
                if (diffIndex.size() > 2) {
                    return false;
                }
            }
        }
        if (diffIndex.size() == 1) {
            return false;
        }
        if (diffIndex.size() == 0) {
            if (hasLetterTwice) {
                return true;
            }
            return false;
        }
        if (s.charAt(diffIndex.get(0)) == goal.charAt(diffIndex.get(1)) && s.charAt(diffIndex.get(1)) == goal.charAt(diffIndex.get(0))) {
            return true;
        }

        return false;
    }
}