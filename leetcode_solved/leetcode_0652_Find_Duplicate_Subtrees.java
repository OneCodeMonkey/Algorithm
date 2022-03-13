// AC: Runtime: 22 ms, faster than 78.83% of Java online submissions for Find Duplicate Subtrees.
// Memory Usage: 53.4 MB, less than 58.43% of Java online submissions for Find Duplicate Subtrees.
// hashmap.
// T:O(n), S:O(n)
// 
class Solution {
    HashSet<TreeNode> ret = new HashSet<>();
    HashMap<String, TreeNode> record = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        preOrderTravel(root);

        return new LinkedList<>(ret);
    }

    public String preOrderTravel(TreeNode root) {
        if (root == null) {
            return ".";
        }
        String left = preOrderTravel(root.left);
        String right = preOrderTravel(root.right);
        String val = "(" + left + ")" + root.val + "(" + right + ")";
        if (record.containsKey(val)) {
            ret.add(record.get(val));
        } else {
            record.put(val, root);
        }

        return val;
    }
}