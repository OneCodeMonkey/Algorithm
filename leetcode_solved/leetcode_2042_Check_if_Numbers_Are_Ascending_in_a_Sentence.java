// AC: Runtime: 3 ms, faster than 42.86% of Java online submissions for Check if Numbers Are Ascending in a Sentence.
// Memory Usage: 38.8 MB, less than 57.14% of Java online submissions for Check if Numbers Are Ascending in a Sentence.
// .
// T:O(n), S:O(n)
//
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int lastNumber = -1;
        for (String str: arr) {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                int temp = Integer.parseInt(str);
                if (lastNumber != -1 && temp <= lastNumber) {
                    return false;
                }
                lastNumber = temp;
            }
        }

        return true;
    }
}