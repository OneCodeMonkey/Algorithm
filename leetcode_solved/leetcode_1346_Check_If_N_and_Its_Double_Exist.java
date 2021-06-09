// AC: Runtime: 2 ms, faster than 38.57% of Java online submissions for Check If N and Its Double Exist.
// Memory Usage: 40.6 MB, less than 5.21% of Java online submissions for Check If N and Its Double Exist.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean checkIfExist(int[] arr) {
        // to record the double or half of the traveled element.
        HashSet<Integer> record = new HashSet<>();
        for (int i: arr) {
            if (record.contains(i)) {
                return true;
            }
            if (i % 2 == 0) {
                if (i == 0) {
                    record.add(0);
                } else {
                    record.add(2 * i);
                    record.add(i / 2);
                }
            } else {
                record.add(2 * i);
            }
        }

        return false;
    }
}