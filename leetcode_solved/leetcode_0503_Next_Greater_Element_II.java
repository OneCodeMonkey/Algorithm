// AC: Runtime: 1 ms, faster than 72.09% of Java online submissions for Find Bottom Left Tree Value.
// Memory Usage: 38.8 MB, less than 48.42% of Java online submissions for Find Bottom Left Tree Value.
// level-order traversal, get last level and output the first element.
// T:O(n), S:O(n)
// 
class Solution {
    List<List<Integer>> record = new ArrayList<>();
    
    public int findBottomLeftValue(TreeNode root) {
        levelOrderTraversal(root, 0);
        return record.get(record.size() - 1).get(0);
    }
    
    private void levelOrderTraversal(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        
        if (record.size() < depth + 1) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(root.val);
            record.add(tempList);
        } else {
            record.get(depth).add(root.val);
        }
        
        levelOrderTraversal(root.left, depth + 1);
        levelOrderTraversal(root.right, depth + 1);
    }
}