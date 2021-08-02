// AC: Runtime: 10 ms, faster than 31.92% of Java online submissions for Maximum Level Sum of a Binary Tree.
// Memory Usage: 42.5 MB, less than 30.51% of Java online submissions for Maximum Level Sum of a Binary Tree.
// level-order traversal
// T:O(n), S:O(n)
// 
class Solution {
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        levelOrderTraversal(root, 0, record);
        int maxSum = Integer.MIN_VALUE, maxSumIndex = -1;
        for (int i = 0; i < record.size(); i++) {
            int tempSum = 0;
            for (int j: record.get(i)) {
                tempSum += j;
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxSumIndex = i + 1;
            }
        }

        return maxSumIndex;
    }

    public void levelOrderTraversal(TreeNode root, int depth, List<List<Integer>> out) {
        if (root == null) {
            return;
        }

        if (out.size() >= depth + 1) {
            out.get(depth).add(root.val);
        } else {
            List<Integer> tempList = new LinkedList<>();
            tempList.add(root.val);
            out.add(tempList);
        }

        if (root.left != null) {
            levelOrderTraversal(root.left, depth + 1, out);
        }
        if (root.right != null) {
            levelOrderTraversal(root.right, depth + 1, out);
        }
    }
}