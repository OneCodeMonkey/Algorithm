// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Second Minimum Node In a Binary Tree.
// Memory Usage: 36.4 MB, less than 23.34% of Java online submissions for Second Minimum Node In a Binary Tree.
// level-order travel
// T:O(n), S:O(n)
//
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        levelOrderTravel(root, 0, record);
        int first = record.get(0).get(0);
        int secondMin = Integer.MAX_VALUE;
        boolean flag = false;
        for (List<Integer> row : record) {
            for (int i : row) {
                if (i != first && i <= secondMin) {
                    secondMin = i;
                    flag = true;
                }
            }
        }
        if (flag) {
            return secondMin;
        }
        return -1;
    }

    private void levelOrderTravel(TreeNode root, int depth, List<List<Integer>> out) {
        if (root == null) {
            return;
        }

        if (out.size() < depth + 1) {
            List<Integer> temp = new LinkedList<>();
            temp.add(root.val);
            out.add(temp);
        } else {
            out.get(depth).add(root.val);
        }

        if (root.left != null) {
            levelOrderTravel(root.left, depth + 1, out);
        }
        if (root.right != null) {
            levelOrderTravel(root.right, depth + 1, out);
        }
    }
}