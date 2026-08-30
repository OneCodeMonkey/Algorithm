// Runtime 2 ms Beats 91.99% 
// Memory 47.23 MB Beats 83.23%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int[] scoreValidator(String[] events) {
        int counter = 0, score = 0;
        for (String event : events) {
            if ("W".equals(event)) {
                counter++;
                if (counter >= 10) {
                    return new int[]{score, counter};
                }
            } else if ("WD".equals(event) || "NB".equals(event)) {
                score++;
            } else {
                score += Integer.parseInt(event);
            }
        }

        return new int[]{score, counter};
    }
}
