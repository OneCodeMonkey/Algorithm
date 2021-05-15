// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Preorder Traversal.
// Memory Usage: 40.1 MB, less than 13.34% of Java online submissions for N-ary Tree Preorder Traversal.
// recursive.
// T:O(n), S:O(n)
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
    public List<Integer> preorder(Node root) {
        List<Integer> ret = new LinkedList<>();
        nargTreePreorderSolve(root, ret);
        
        return ret;
    }

    private void nargTreePreorderSolve(Node root, List<Integer> out) {
        if (root == null) {
            return;
        }
        out.add(root.val);
        if (root.children.isEmpty()) {
            return;
        }
        for (Node node: root.children) {
            nargTreePreorderSolve(node, out);
        }
    }
}