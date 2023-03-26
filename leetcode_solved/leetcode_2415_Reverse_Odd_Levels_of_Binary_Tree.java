// Solution 1: Level-order traversal.
// AC: Runtime 924 ms Beats 5.20% 
// Memory 48.1 MB Beats 56.97%
// Level order traversal and store it, and reverse odd level
// T:O(n), S:O(n)
// 
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        List<List<TreeNode>> record = new LinkedList<>();
        levelOrderTraversal(root, record, 0);
        for (int i = 0; i < record.size(); i++) {
            if (i + 1 >= record.size()) {
                break;
            }
            if ((i + 1) % 2 == 1) {
                Collections.reverse(record.get(i + 1));
            }
            for (int j = 0; j < record.get(i).size(); j++) {
                record.get(i).get(j).left = record.get(i + 1).get(2 * j);
                record.get(i).get(j).right = record.get(i + 1).get(2 * j + 1);
            }
        }

        return record.get(0).get(0);
    }

    public void levelOrderTraversal(TreeNode root, List<List<TreeNode>> record, int depth) {
        if (root == null) {
            return;
        }
        if (record.size() < depth + 1) {
            record.add(new LinkedList<>());
        }
        record.get(depth).add(root);
        if (root.left == null && root.right == null) {
            return;
        }
        levelOrderTraversal(root.left, record, depth + 1);
        levelOrderTraversal(root.right, record, depth + 1);
    }
}


// Solution 2: Recursion
// todo