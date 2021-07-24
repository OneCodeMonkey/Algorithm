// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Path In Zigzag Labelled Binary Tree.
// Memory Usage: 36.4 MB, less than 84.74% of Java online submissions for Path In Zigzag Labelled Binary Tree.
// find the regularity of this infinite binary tree.
// T:O(logn), S:O(1)
// 
class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> ret = new LinkedList<>();
        ret.add(0, label);
        int depth = 0;
        for (int i = 0; i < 31; i++) {
            int pow1 = (int)Math.pow(2, i), pow2 = (int)Math.pow(2, i + 1);
            if (label >= pow1 && label < pow2) {
                depth = i;
                break;
            }
        }
        while(depth > 0) {
            int offset, parentNodeVal, curRowNum = (int) Math.pow(2, depth), lastRowNum = (int)Math.pow(2, depth - 1);
            if (depth % 2 == 1) {
                offset = label - curRowNum;
                parentNodeVal = lastRowNum + (lastRowNum - offset / 2 - 1);
            } else {
                offset = label - curRowNum;
                parentNodeVal = curRowNum - offset / 2 - 1;
            }
            label = parentNodeVal;
            depth--;
            ret.add(0, label);
        }

        return ret;
    }
}