// Recursive.
// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of N-ary Tree.
// Memory Usage: 38.9 MB, less than 66.27% of Java online submissions for Maximum Depth of N-ary Tree.
// 略。
// T:O(n), S:O(1)
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
    public int maxDepth(Node root) {
        return solve(root, 0);
    }

    private int solve(Node root, int depth) {
        if (root == null) {
            return depth;
        }
        depth += 1;
        if (root.children == null || root.children.size() == 0) {
            return depth;
        } else {
            int maxDepth = 0;
            for (Node child: root.children) {
                int depthTemp = solve(child, depth);
                if (depthTemp > maxDepth) {
                    maxDepth = depthTemp;
                }
            }
            return maxDepth;
        }
    }
}