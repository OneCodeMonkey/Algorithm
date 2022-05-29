// AC: Runtime: 3 ms, faster than 28.57% of Java online submissions for Check if Number Has Equal Digit Count and Digit Value.
// Memory Usage: 41.1 MB, less than 100.00% of Java online submissions for Check if Number Has Equal Digit Count and Digit Value.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (char c : num.toCharArray()) {
            record.merge(Integer.parseInt(String.valueOf(c)), 1, Integer::sum);
        }
        for (int i = 0; i < num.length(); i++) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) != (record.getOrDefault(i, 0))) {
                return false;
            }
        }

        return true;
    }
}