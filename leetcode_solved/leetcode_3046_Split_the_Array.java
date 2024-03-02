// Runtime 3 ms Beats 50.00% of users with Java
// Memory 42.78 MB Beats 50.00% of users with Java
// Hashmap. Just check every element's occurence <= 2, if not, the answer is false.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            record.merge(num, 1, Integer::sum);
        }
        boolean ret = true;
        if (record.size() >= nums.length / 2) {
            for (int num : record.keySet()) {
                if (record.get(num) > 2) {
                    ret = false;
                    break;
                }
            }
        } else {
            ret = false;
        }

        return ret;
    }
}
