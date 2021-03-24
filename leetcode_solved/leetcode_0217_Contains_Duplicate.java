// AC：T:O(n), S:O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        int size = nums.length;
        for(int i = 0; i < size; i++) {
            if (record.contains(nums[i])) {
                return true;
            }
            record.add(nums[i]);
        }
        return false;
    }
}

// 法二：先排序，再判断连续两个元素是否相等。
// T:O(n logn), S:O(logn) (调用栈深度)
