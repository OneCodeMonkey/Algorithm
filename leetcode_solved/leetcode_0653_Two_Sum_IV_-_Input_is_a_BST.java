// AC: Runtime: 84 ms, faster than 5.02% of Java online submissions for Two Sum IV - Input is a BST.
// Memory Usage: 40.5 MB, less than 33.60% of Java online submissions for Two Sum IV - Input is a BST.
// .
// T:O(n), S:O(n)
//
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> record = new LinkedList<>();
        inOrderTraversal(root, record);
        if (record.size() < 2) {
            return false;
        }
        int left = 0, right = record.size() - 1;
        while (left < right) {
            int tempSum = record.get(left) + record.get(right);
            if (tempSum == k) {
                return true;
            } else if (tempSum > k) {
                right--;
            } else {
                left++;
            }
        }

        return false;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, out);
        out.add(root.val);
        inOrderTraversal(root.right, out);
    }
}