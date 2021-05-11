// AC:
// Runtime: 1 ms, faster than 89.32% of Java online submissions for N-ary Tree Level Order Traversal.
// Memory Usage: 39.8 MB, less than 63.18% of Java online submissions for N-ary Tree Level Order Traversal.
// 思路：类比二叉树层次序递归
// 复杂度：T:O(n), S:O(n)
// 
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        levelOrderSolve(root, ret, 0);

        return ret;
    }

    private void levelOrderSolve(Node root, List<List<Integer>> out, int depth) {
        if (root == null) {
            return;
        }
        if (out.size() < depth + 1) {
            List<Integer> temp = new LinkedList<>();
            out.add(temp);
        }
        out.get(depth).add(root.val);
        for (Node childNode: root.children) {
            levelOrderSolve(childNode, out, depth + 1);
        }
    }
}