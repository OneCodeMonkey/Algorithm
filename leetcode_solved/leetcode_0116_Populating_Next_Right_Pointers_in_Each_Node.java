// AC:
// Runtime: 1 ms, faster than 53.74% of Java online submissions for Populating Next Right Pointers in Each Node.
// Memory Usage: 39.1 MB, less than 66.55% of Java online submissions for Populating Next Right Pointers in Each Node.
// 思路：层次序递归，然后再递归设置每个 node 的 next
// 复杂度：T:O(n), S:O(n)
// 
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        List<List<Node>> record = new LinkedList<>();
        // 记录层次序
        levelOrderSolve(root, record, 0);
        // 递归设置 root 每个节点的 next
        setNodeNext(root, record, 0);

        return root;
    }

    private void levelOrderSolve(Node root, List<List<Node>> out, int depth) {
        if (root == null) {
            return;
        }
        if (out.size() < depth + 1) {
            List<Node> temp = new LinkedList<>();
            out.add(temp);
        }
        out.get(depth).add(root);
        levelOrderSolve(root.left, out, depth + 1);
        levelOrderSolve(root.right, out, depth + 1);
    }

    private void setNodeNext(Node root, List<List<Node>> record, int depth) {
        if (root == null) {
            return;
        }
        if (record.get(depth).size() <= 1) {
            root.next = null;
        } else {
            root.next = record.get(depth).get(1);
            record.get(depth).remove(0);
        }
        setNodeNext(root.left, record, depth + 1);
        setNodeNext(root.right, record, depth + 1);
    }
}