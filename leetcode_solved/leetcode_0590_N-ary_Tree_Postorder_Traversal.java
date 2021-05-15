// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for N-ary Tree Postorder Traversal.
// Memory Usage: 40 MB, less than 29.18% of Java online submissions for N-ary Tree Postorder Traversal.
// recursive
// T:O(n), S:O(n)
//
/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ret = new LinkedList<>();
        nargTreePreorderSolve(root, ret);

        return ret;
    }

    private void nargTreePreorderSolve(Node root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.children.isEmpty()) {
            out.add(root.val);
        } else {
            for (Node node : root.children) {
                nargTreePreorderSolve(node, out);
            }
            out.add(root.val);
        }
    }
}