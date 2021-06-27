// AC: Runtime: 8 ms, faster than 33.18% of Java online submissions for Sort Array by Increasing Frequency.
// Memory Usage: 39.5 MB, less than 21.86% of Java online submissions for Sort Array by Increasing Frequency.
// using treemap to sort occurence times.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: nums) {
            record.merge(i, 1, Integer::sum);
        }
        TreeMap<Integer, List<Integer>> record2 = new TreeMap<>();
        for (int i: record.keySet()) {
            int time = record.get(i);
            if (record2.containsKey(time)) {
                record2.get(time).add(i);
            } else {
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                record2.put(time, temp);
            }
        }
        int[] ret = new int[nums.length];
        int pos = 0;
        for (int time: record2.keySet()) {
            List<Integer> temp2 = record2.get(time);
            Collections.sort(temp2);
            for (int i = temp2.size() - 1; i >= 0; i--) {
                for (int j = 0; j < time; j++) {
                    ret[pos++] = temp2.get(i);
                }
            }
        }
        
        return ret;
    }
}