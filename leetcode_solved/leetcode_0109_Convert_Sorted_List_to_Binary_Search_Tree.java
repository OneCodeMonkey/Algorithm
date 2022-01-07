// AC: Runtime: 2 ms, faster than 14.34% of Java online submissions for Convert Sorted List to Binary Search Tree.
// Memory Usage: 39.6 MB, less than 87.45% of Java online submissions for Convert Sorted List to Binary Search Tree.
// convert linked-list to array, then convert array to balanced binary tree.
// T:O(n), S:O(n)
// 
class Solution {
    List<Integer> record = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        while (head != null) {
            record.add(head.val);
            head = head.next;
        }
        return convertArrayToBST(record);
    }

    private TreeNode convertArrayToBST(List<Integer> record) {
        if (record.size() == 0) {
            return null;
        } else if (record.size() == 1) {
            return new TreeNode(record.get(0));
        } else {
            int middleIndex = record.size() / 2;
            TreeNode retRoot = new TreeNode(record.get(middleIndex));
            retRoot.left = convertArrayToBST(record.subList(0, middleIndex));
            retRoot.right = convertArrayToBST(record.subList(middleIndex + 1, record.size()));
            return retRoot;
        }
    }
}