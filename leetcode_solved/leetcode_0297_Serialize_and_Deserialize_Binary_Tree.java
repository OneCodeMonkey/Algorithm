// AC: Runtime: 7 ms, faster than 92.97% of Java online submissions for Serialize and Deserialize Binary Tree.
// Memory Usage: 40.9 MB, less than 77.97% of Java online submissions for Serialize and Deserialize Binary Tree.
// see @https://leetcode.com/problems/serialize-and-deserialize-binary-tree/discuss/74253/Easy-to-understand-Java-Solution
// T:O(n), S:O(n)
// 
public class Codec {
    private final String spliter = ",";
    private final String nullSign = "N";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        treeToString(root, sb);

        return sb.toString();
    }

    private void treeToString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(nullSign).append(spliter);
        } else {
            sb.append(root.val).append(spliter);
            treeToString(root.left, sb);
            treeToString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(spliter)));

        return stringToTree(queue);
    }

    private TreeNode stringToTree(Deque<String> queue) {
        if (queue == null) {
            return null;
        }
        String val = queue.poll();
        if (val.equals(nullSign)) {
            return null;
        } else {
            TreeNode node1 = new TreeNode(Integer.parseInt(val));
            node1.left = stringToTree(queue);
            node1.right = stringToTree(queue);

            return node1;
        }
    }
}