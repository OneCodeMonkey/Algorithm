// AC: Runtime: 17 ms, faster than 37.69% of Java online submissions for All Elements in Two Binary Search Trees.
// Memory Usage: 41.7 MB, less than 80.19% of Java online submissions for All Elements in Two Binary Search Trees.
// .
// T:O(len1 + len2)), S:O(len1 + len2)
// 
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> ret = new ArrayList<>();
        inOrderTravel(root1, list1);
        inOrderTravel(root2, list2);
        int pos1 = 0, pos2 = 0;
        while (pos1 < list1.size() || pos2 < list2.size()) {
            if (pos1 >= list1.size()) {
                while (pos2 < list2.size()) {
                    ret.add(list2.get(pos2++));
                }
            } else if (pos2 >= list2.size()) {
                while (pos1 < list1.size()) {
                    ret.add(list1.get(pos1++));
                }
            } else {
                if (list1.get(pos1).equals(list2.get(pos2))) {
                    ret.add(list1.get(pos1++));
                    ret.add(list2.get(pos2++));
                } else if (list1.get(pos1) > list2.get(pos2)) {
                    ret.add(list2.get(pos2++));
                } else {
                    ret.add(list1.get(pos1++));
                }
            }
        }

        return ret;
    }

    public void inOrderTravel(TreeNode root, List<Integer> out) {
        if (root == null) {
            return;
        }
        inOrderTravel(root.left, out);
        out.add(root.val);
        inOrderTravel(root.right, out);
    }
}