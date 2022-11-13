// Runtime 90 ms Beats 75% 
// Memory 58.6 MB Beats 50%
// .
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int minimumOperations(TreeNode root) {
        int ret = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> levelVals = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = nodes.poll();
                if (node.left != null) {
                    nodes.offer(node.left);
                    levelVals.add(node.left.val);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                    levelVals.add(node.right.val);
                }
            }
            ret += solve(levelVals);
        }

        return ret;
    }

    private int solve(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);
        Collections.sort(listCopy);
        HashMap<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapping.put(list.get(i), i);
        }
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(listCopy.get(i))) {
                ret++;
                mapping.put(list.get(i), mapping.get(listCopy.get(i)));
                list.set(mapping.get(listCopy.get(i)), list.get(i));
            }
        }

        return ret;
    }
}
