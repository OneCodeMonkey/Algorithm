// todo
// boyer-moore vote algorithm.

// .



// NOT O(1) solution
// Runtime: 6 ms, faster than 46.36% of Java online submissions for Majority Element II.
// Memory Usage: 42.7 MB, less than 65.27% of Java online submissions for Majority Element II.
// using hashmap, 
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: nums) {
            record.merge(i, 1, Integer::sum);
        }
        List<Integer> ret = new LinkedList<>();
        for (int i: record.keySet()) {
            if (record.get(i) > nums.length / 3) {
                ret.add(i);
            }
        }

        return ret;
    }
}