// AC: Runtime 67 ms Beats 10.53% 
// Memory 91.9 MB Beats 5.20%
// Level-order traversal & sort
// T:O(n), S:O(n)
// 
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<List<Integer>> record = new ArrayList<>();

        levelOrderTraversal(root, record, 0);
        if (record.size() < k) {
            return -1;
        }
        List<Long> levelSums = new ArrayList<>();
        for (List<Integer> row : record) {
            long sum = 0;
            for (int i : row) {
                sum += i;
            }
            levelSums.add(sum);
        }
        Collections.sort(levelSums);
        return levelSums.get(levelSums.size() - k);
    }

    private void levelOrderTraversal(TreeNode root, List<List<Integer>> record, int depth) {
        if (root == null) {
            return;
        }
        if (record.size() < depth + 1) {
            record.add(new ArrayList<>());
        }
        record.get(depth).add(root.val);
        if (root.left == null && root.right == null) {
            return;
        }
        levelOrderTraversal(root.left, record, depth + 1);
        levelOrderTraversal(root.right, record, depth + 1);
    }
}
