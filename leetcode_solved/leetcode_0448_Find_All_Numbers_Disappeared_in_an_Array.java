// AC:
// Runtime: 17 ms, faster than 29.00% of Java online submissions for Find All Numbers Disappeared in an Array.
// Memory Usage: 48 MB, less than 57.23% of Java online submissions for Find All Numbers Disappeared in an Array.
// 复杂度: T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        List<Integer> ret = new LinkedList<>();
        HashSet<Integer> record = new HashSet<>();
        for (int i = 0; i < size; i++) {
            record.add(nums[i]);
        }
        for (int i = 1; i <= size; i++) {
            if (record.contains(i)) {
                continue;
            }
            ret.add(i);
        }
        return ret;
    }
}