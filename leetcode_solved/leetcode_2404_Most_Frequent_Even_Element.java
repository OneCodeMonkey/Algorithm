// AC: Runtime: 83 ms, faster than 22.22% of Java online submissions for Most Frequent Even Element.
// Memory Usage: 62.1 MB, less than 11.11% of Java online submissions for Most Frequent Even Element.
// sort.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                record.merge(num, 1, Integer::sum);
            }
        }
        if (record.isEmpty()) {
            return -1;
        } else {
            int[][] sorting = new int[record.size()][2];
            int pos = 0;
            for (int i : record.keySet()) {
                sorting[pos][0] = i;
                sorting[pos][1] = record.get(i);
                pos++;
            }
            Arrays.sort(sorting, (a, b) -> a[1] == b[1] ? (b[0] - a[0]) : (a[1] - b[1]));

            return sorting[sorting.length - 1][0];
        }
    }
}
