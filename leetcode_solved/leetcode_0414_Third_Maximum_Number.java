// AC:
// Runtime: 2 ms, faster than 65.30% of Java online submissions for Third Maximum Number.
// Memory Usage: 38.4 MB, less than 88.43% of Java online submissions for Third Maximum Number.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int thirdMax(int[] nums) {
        // 维护一个大小为3的不重复元素的list，因为题目是独立的第 K 大的数
        List<Integer> record = new ArrayList<>();
        for (Integer i: nums) {
            if (record.size() == 3 && i <= record.get(0)) {
                continue;
            }
            if (!record.contains(i)) {
                record.add(i);
            }
            if (record.size() > 3) {
                Collections.sort(record);
                record.remove(0);
            }
        }
        Collections.sort(record);
        if (record.size() < 3) {
            return record.get(record.size() - 1);
        } else {
            return record.get(0);
        }
    }
}