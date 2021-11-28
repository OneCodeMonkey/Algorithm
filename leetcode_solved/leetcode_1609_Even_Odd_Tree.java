// AC: Runtime: 26 ms, faster than 14.77% of Java online submissions for Even Odd Tree.
// Memory Usage: 65.9 MB, less than 34.09% of Java online submissions for Even Odd Tree.
// level-order  traversal, notice we can't use recursion because this will case TLE.
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> record = new ArrayList<>();
        boolean ret = levelOrderTraversal(root, record);
        if (!ret) {
            return false;
        }

        for (int i = 0; i < record.size(); i++) {
            int prev = i % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int j: record.get(i)) {
                if ((i % 2 == 0 && (j % 2 == 0 || j <= prev)) || (i % 2 == 1 && (j % 2 == 1 || j >= prev))) {
                    return false;
                }
                prev = j;
            }
        }

        return true;
    }

    private boolean levelOrderTraversal(TreeNode root, List<List<Integer>> out) {
        if (root == null) {
            return true;
        }
        if (root.val % 2 == 0) {
            return false;
        }

        int depth = 0;
        List<Integer> tempList = new LinkedList<>();
        tempList.add(root.val);
        out.add(tempList);

        List<TreeNode> toSearch = new LinkedList<>();
        if (root.left != null) {
            toSearch.add(root.left);
        }
        if (root.right != null) {
            toSearch.add(root.right);
        }

        while (!toSearch.isEmpty()) {
            depth++;
            List<TreeNode> newAdd = new LinkedList<>();
            List<Integer> levelList = new LinkedList<>();
            for (TreeNode node: toSearch) {
                if ((depth % 2 == 0 && node.val % 2 == 0) || (depth % 2 == 1 && node.val % 2 == 1)) {
                    return false;
                }
                levelList.add(node.val);
                if (node.left != null) {
                    newAdd.add(node.left);
                }
                if (node.right != null) {
                    newAdd.add(node.right);
                }
            }
            out.add(levelList);
            toSearch = newAdd;
        }

        return true;
    }
}