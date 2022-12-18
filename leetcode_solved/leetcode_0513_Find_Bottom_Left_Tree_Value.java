// Solution 1: level-order travel, and get the lowest level's left-most node value.
// AC: Runtime 2 ms Beats 58.83% 
// Memory 44 MB Beats 50.6%
// level-order travel
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


// Solution 2: Using queue to travel tree
// AC: Runtime 4 ms Beats 33.64% 
// Memory 44.2 MB Beats 29.56%
// using queue to travel tree
// T:O(n), S:O(1)
// 
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node = new TreeNode(-1);
        while (!queue.isEmpty()) {
            node = queue.poll();
            // from the right side of every tree level
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
        }

        return node.val;
    }
}
