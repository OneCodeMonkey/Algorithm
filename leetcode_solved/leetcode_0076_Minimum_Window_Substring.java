// AC: Runtime: 122 ms, faster than 5.02% of Java online submissions for Minimum Window Substring.
// Memory Usage: 39.9 MB, less than 32.04% of Java online submissions for Minimum Window Substring.
// sliding window
// T:O(26 * n + m) ~ O(m + n), S:O(26 * 2) ~ O(1)
// 
class Solution {
    public String minWindow(String s, String t) {
        int sizeS = s.length(), sizeT = t.length(), minSize = Integer.MAX_VALUE, left = -1, right = -1;
        if (sizeS < sizeT) {
            return "";
        }

        HashMap<Character, Integer> recordS = new HashMap<>(), recordT = new HashMap<>();
        for (char c : t.toCharArray()) {
            recordT.merge(c, 1, Integer::sum);
        }
        for (char c : s.toCharArray()) {
            recordS.merge(c, 1, Integer::sum);
        }

        for (char c : recordT.keySet()) {
            if (!recordS.containsKey(c) || recordS.get(c) < recordT.get(c)) {
                return "";
            }
        }

        int leftPos = 0, rightPos = 0;
        HashMap<Character, Integer> tempRecord = new HashMap<>();
        tempRecord.merge(s.charAt(rightPos), 1, Integer::sum);

        while (leftPos <= sizeS - 1) {
            // right pointer forwarding
            while (rightPos < sizeS - 1 && !check(tempRecord, recordT)) {
                rightPos++;
                tempRecord.merge(s.charAt(rightPos), 1, Integer::sum);
            }
            if (check(tempRecord, recordT)) {
                if (rightPos - leftPos + 1 < minSize) {
                    minSize = rightPos - leftPos + 1;
                    left = leftPos;
                    right = rightPos;
                }
            } else {
                break;
            }

            // left pointer forwarding
            while (leftPos <= sizeS - 1 && check(tempRecord, recordT)) {
                if (rightPos - leftPos + 1 < minSize) {
                    minSize = rightPos - leftPos + 1;
                    left = leftPos;
                    right = rightPos;
                }
                tempRecord.merge(s.charAt(leftPos), -1, Integer::sum);
                leftPos++;
            }
        }

        return left == -1 ? "" :s.substring(left, right + 1);
    }

    private boolean check(HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {
        for (char c : h2.keySet()) {
            if (!h1.containsKey(c) || h2.get(c) > h1.get(c)) {
                return false;
            }
        }

        return true;
    }
}