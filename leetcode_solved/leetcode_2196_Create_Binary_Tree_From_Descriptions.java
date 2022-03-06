// AC: Runtime: 181 ms, faster than 25.00% of Java online submissions for Create Binary Tree From Descriptions.
// Memory Usage: 119.3 MB, less than 25.00% of Java online submissions for Create Binary Tree From Descriptions.
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        // in-degree
        HashMap<TreeNode, Integer> record = new HashMap<>();
        // find node
        HashMap<Integer, TreeNode> valueToNode = new HashMap<>();

        for (int[] description : descriptions) {
            if (!valueToNode.containsKey(description[0])) {
                TreeNode newNode = new TreeNode(description[0]);
                valueToNode.put(description[0], newNode);
            }
            if (!valueToNode.containsKey(description[1])) {
                TreeNode newNode = new TreeNode(description[1]);
                valueToNode.put(description[1], newNode);
            }
            if (description[2] == 1) {
                valueToNode.get(description[0]).left = valueToNode.get(description[1]);
            } else {
                valueToNode.get(description[0]).right = valueToNode.get(description[1]);
            }

            record.merge(valueToNode.get(description[1]), 1, Integer::sum);
            if (!record.containsKey(valueToNode.get(description[0]))) {
                record.put(valueToNode.get(description[0]), 0);
            }
        }

        for (TreeNode node : record.keySet()) {
            if (record.get(node) == 0) {
                return node;
            }
        }

        return new TreeNode(-1);
    }
}