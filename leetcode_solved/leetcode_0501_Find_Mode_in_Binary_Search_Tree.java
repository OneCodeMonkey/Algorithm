// AC: Runtime: 216 ms, faster than 5.24% of Java online submissions for Find Mode in Binary Search Tree.
// Memory Usage: 43.3 MB, less than 5.78% of Java online submissions for Find Mode in Binary Search Tree.
// in-order travel and compare
// T:O(n), S:O(n)
// 
class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> record = new LinkedList<>();
        inOrderTravel(root, record);
        if (record.size() == 1) {
            return new int[]{record.get(0)};
        }

        HashSet<Integer> maxElement = new HashSet<>();
        int max = 1, tempCount = 1;
        maxElement.add(record.get(0));
        for (int i = 1; i < record.size(); i++) {
            if (!record.get(i).equals(record.get(i - 1))) {
                tempCount = 1;
                if (max == 1) {
                    maxElement.add(record.get(i));
                }
            } else {
                tempCount++;
                if (tempCount > max) {
                    max = tempCount;
                    maxElement.clear();
                    maxElement.add(record.get(i));
                }
                if (tempCount == max) {
                    maxElement.add(record.get(i));
                }
            }
        }
        int pos = 0;
        int[] ret = new int[maxElement.size()];
        for (int i : maxElement) {
            ret[pos++] = i;
        }
        return ret;
    }

    private void inOrderTravel(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrderTravel(root.left, out);
        }
        out.add(root.val);

        if (root.right != null) {
            inOrderTravel(root.right, out);
        }
    }
}
