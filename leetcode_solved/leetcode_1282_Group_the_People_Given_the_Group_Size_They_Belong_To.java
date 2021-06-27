// AC: Runtime: 6 ms, faster than 45.14% of Java online submissions for Group the People Given the Group Size They Belong To.
// Memory Usage: 39.7 MB, less than 49.57% of Java online submissions for Group the People Given the Group Size They Belong To.
// using hashmap
// T:O(n), S:O(n)
// 
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int size = groupSizes.length;
        HashMap<Integer, List<Integer>> record = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int groupSize = groupSizes[i];
            if (!record.containsKey(groupSize)) {
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                record.put(groupSize, temp);
            } else {
                record.get(groupSize).add(i);
            }
        }
        List<List<Integer>> ret = new LinkedList<>();
        for (int groupSize: record.keySet()) {
            int tempSize = record.get(groupSize).size(), pos = 0;
            for (int i = 0; i < tempSize / groupSize; i++) {
                List<Integer> tempList = new LinkedList<>();
                for (int j = 0; j < groupSize; j++) {
                    tempList.add(record.get(groupSize).get(pos++));
                }
                ret.add(tempList);
            }
        }
        
        return ret;
    }
}