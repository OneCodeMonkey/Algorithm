// AC: Runtime: 4 ms, faster than 66.67% of Java online submissions for Kth Distinct String in an Array.
// Memory Usage: 38.9 MB, less than 11.11% of Java online submissions for Kth Distinct String in an Array.
// .
// T:O(n), S:O(n)
//
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> record = new LinkedHashMap<>();
        for (String str: arr) {
            record.merge(str, 1, Integer::sum);
        }
        int count = 0;
        for (String str: record.keySet()) {
            if (record.get(str) == 1) {
                count++;
                if (count == k) {
                    return str;
                }
            }
        }

        return "";
    }
}