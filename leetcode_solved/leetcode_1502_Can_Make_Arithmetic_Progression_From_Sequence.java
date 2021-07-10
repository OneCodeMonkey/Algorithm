// AC: Runtime: 2 ms, faster than 22.76% of Java online submissions for Can Make Arithmetic Progression From Sequence.
// Memory Usage: 39.9 MB, less than 7.41% of Java online submissions for Can Make Arithmetic Progression From Sequence.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int size = arr.length, minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;
        HashSet<Integer> record = new HashSet<>();
        for (int i: arr) {
            minValue = Math.min(minValue, i);
            maxValue = Math.max(maxValue, i);
        }
        if (maxValue == minValue) {
            return true;
        }
        for (int i: arr) {
            record.add(i - minValue);
        }

        if (size != record.size()) {
            return false;
        }
        if ((maxValue - minValue) % (size - 1) != 0) {
            return false;
        }
        int diff = (maxValue - minValue) / (size - 1);
        for (int i: arr) {
            if ((i - minValue) % diff != 0) {
                return false;
            }
        }

        return true;
    }
}