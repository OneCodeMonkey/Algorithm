// AC: Runtime: 6 ms, faster than 57.91% of Java online submissions for Most Frequent Subtree Sum.
// Memory Usage: 40.8 MB, less than 47.36% of Java online submissions for Most Frequent Subtree Sum.
// hashmap & binary tree recursion
// T:O(n), S:O(n)
//
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer, Integer> valueCount = new HashMap<>();
        getValue(root, valueCount);
        TreeMap<Integer, List<Integer>> freqSort = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int val: valueCount.keySet()) {
            int freq = valueCount.get(val);
            if (freqSort.containsKey(freq)) {
                freqSort.get(freq).add(val);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(val);
                freqSort.put(freq, tempList);
            }
        }
        for (int freq: freqSort.keySet()) {
            List<Integer> retList = freqSort.get(freq);
            int[] ret = new int[retList.size()];
            int pos = 0;
            for (int i: retList) {
                ret[pos++] = i;
            }

            return ret;
        }
        return new int[0];
    }

    public int getValue(TreeNode root, HashMap<Integer, Integer> valueCount) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            valueCount.merge(root.val, 1, Integer::sum);
            return root.val;
        }

        int nodeVal = root.val;
        if (root.left != null) {
            nodeVal += getValue(root.left, valueCount);
        }
        if (root.right != null) {
            nodeVal += getValue(root.right, valueCount);
        }

        valueCount.merge(nodeVal, 1, Integer::sum);

        return nodeVal;
    }
}