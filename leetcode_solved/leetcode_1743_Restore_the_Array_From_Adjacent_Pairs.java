// AC: Runtime: 153 ms, faster than 74.61% of Java online submissions for Restore the Array From Adjacent Pairs.
// Memory Usage: 88.5 MB, less than 80.27% of Java online submissions for Restore the Array From Adjacent Pairs.
// find the endpoint element, then using a hashmap to search adjacent element, until reach another enpoint element.
// T:O(n), S:O(n)
//
class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> record = new HashMap<>();
        HashMap<Integer, Integer> recordCount = new HashMap<>();
        for (int[] pair: adjacentPairs) {
            if (record.containsKey(pair[0])) {
                record.get(pair[0]).add(pair[1]);
            } else {
                List<Integer> temp = new LinkedList<>();
                temp.add(pair[1]);
                record.put(pair[0], temp);
            }
            if (record.containsKey(pair[1])) {
                record.get(pair[1]).add(pair[0]);
            } else {
                List<Integer> temp = new LinkedList<>();
                temp.add(pair[0]);
                record.put(pair[1], temp);
            }
            recordCount.merge(pair[0], 1, Integer::sum);
            recordCount.merge(pair[1], 1, Integer::sum);
        }
        List<Integer> ret = new ArrayList<>();
        int curElement = -1;
        for (int i: recordCount.keySet()) {
            if (recordCount.get(i) == 1) {
                curElement = i;
                ret.add(curElement);
                break;
            }
        }
        curElement = record.get(curElement).get(0);
        ret.add(curElement);
        while (record.get(curElement).size() != 1) {
            if (record.get(curElement).get(0).intValue() != ret.get(ret.size() - 2)) {
                curElement = record.get(curElement).get(0);
            } else {
                curElement = record.get(curElement).get(1);
            }
            ret.add(curElement);
        }
        int[] retArr = new int[ret.size()];
        int pos = 0;
        for (int i: ret) {
            retArr[pos++] = i;
        }

        return retArr;
    }
}