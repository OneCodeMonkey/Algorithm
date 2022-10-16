// AC: Runtime 275 ms Beats 16.67% 
// Memory 154.4 MB Beats 16.67%
// Hashset & reverse int
// T:O(n), S:O(n)
// 
class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        for (int i : nums) {
            record.add(i);
        }
        HashSet<Integer> reverseAdded = new HashSet<>();
        for (int i : record) {
            int reversedInt = reverseInteger(i);
            if (!record.contains(reversedInt)) {
                reverseAdded.add(reversedInt);
            }
        }

        return record.size() + reverseAdded.size();
    }

    private int reverseInteger(int i) {
        if (i < 10) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i));

        return Integer.parseInt(sb.reverse().toString());
    }
}
