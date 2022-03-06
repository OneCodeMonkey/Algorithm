// AC: Runtime: 2 ms, faster than 78.02% of Java online submissions for Maximum Width of Binary Tree.
// Memory Usage: 41.7 MB, less than 47.69% of Java online submissions for Maximum Width of Binary Tree.
// levelOrder travel, and use a hashmap to record TreeNode's index, and get max width of level nodes.
// T:O(n), S:O(n)
// 
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ret = 0;
        if (root != null) {
            Queue<TreeNode> travel = new LinkedList<>();
            HashMap<TreeNode, Integer> indexes = new HashMap<>();
            travel.offer(root);
            indexes.put(root, 1);

            while (!travel.isEmpty()) {
                int startIndex = 0, endIndex = 0, currentQueueSize = travel.size();
                for (int i = 0; i < currentQueueSize; i++) {
                    TreeNode cur = travel.poll();
                    if (i == 0) {
                        startIndex = indexes.get(cur);
                    }
                    if (i == currentQueueSize - 1) {
                        endIndex = indexes.get(cur);
                    }
                    if (cur.left != null) {
                        indexes.put(cur.left, indexes.get(cur) * 2);
                        travel.offer(cur.left);
                    }

                    if (cur.right != null) {
                        indexes.put(cur.right, indexes.get(cur) * 2 + 1);
                        travel.offer(cur.right);
                    }
                }
                ret = Math.max(ret, endIndex - startIndex + 1);
            }
        }

        return ret;
    }
}