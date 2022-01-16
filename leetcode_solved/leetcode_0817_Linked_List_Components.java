// AC: Runtime: 4 ms, faster than 94.59% of Java online submissions for Linked List Components.
// Memory Usage: 40 MB, less than 50.73% of Java online submissions for Linked List Components.
// hashset: one pass check node val is in nums.
// T:O(n), S:O(m), n is number of nodes, m = nums.length()
// 
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int ret = 0;
        HashSet<Integer> record = new HashSet<>();
        for (int i:nums) {
            record.add(i);
        }
        boolean flag = false;
        while (head != null) {
            if (record.contains(head.val)) {
                if (!flag) {
                    ret++;
                    flag = true;
                }
            } else {
                if (flag) {
                    flag = false;
                }
            }
            head = head.next;
        }
        
        return ret;
    }
}