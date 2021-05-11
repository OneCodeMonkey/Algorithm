// AC：
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
// Memory Usage: 38.8 MB, less than 77.13% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
// 思路：先层次序遍历，拿到结果。然后再对结果的偶数层级进行倒序
// T：O(n), S:O(n), n 为树的节点个数
// 
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        List<List<Integer>> ret2 = new ArrayList<>();
        LevelOrderSolve(root, ret, 0);
        // 按zigzag对偶数层进行倒序
        for (int i = 0; i < ret.size(); i++) {
            if (i % 2 == 0) {
                ret2.add(ret.get(i));
            } else {
                List<Integer> temp = new ArrayList<>();
                for (int j = ret.get(i).size() - 1; j >= 0; j--) {
                    temp.add(ret.get(i).get(j));
                }
                ret2.add(temp);
            }
        }

        return ret2;
    }

    private void LevelOrderSolve(TreeNode root, List<List<Integer>> out, int depth) {
        if (root == null) {
            return;
        }
        if (out.size() < depth + 1) {
            List<Integer> temp = new ArrayList<>();
            out.add(temp);
        }
        out.get(depth).add(root.val);
        LevelOrderSolve(root.left, out, depth + 1);
        LevelOrderSolve(root.right, out, depth + 1);
    }
}