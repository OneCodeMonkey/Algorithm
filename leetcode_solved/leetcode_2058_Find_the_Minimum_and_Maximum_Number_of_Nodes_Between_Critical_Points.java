// AC: Runtime: 9 ms, faster than 66.67% of Java online submissions for Find the Minimum and Maximum Number of Nodes Between Critical Points.
// Memory Usage: 59.6 MB, less than 100.00% of Java online submissions for Find the Minimum and Maximum Number of Nodes Between Critical Points.
// .
// T:O(n), S:O(n)
//
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> index = new ArrayList<>();
        ListNode headCopy = head;
        int prevNodeVal = headCopy.val, prevPrevNodeVal = -1, count = 1;
        while (headCopy.next != null) {
            headCopy = headCopy.next;
            count++;
            int val = headCopy.val;
            if (prevPrevNodeVal != -1) {
                if ((prevNodeVal > prevPrevNodeVal && prevNodeVal > val) || (prevNodeVal < prevPrevNodeVal && prevNodeVal < val)) {
                    index.add(count);
                }
            }
            prevPrevNodeVal = prevNodeVal;
            prevNodeVal = val;
        }
        int[] ret = new int[]{-1, -1};
        if (index.size() >= 2) {
            ret[1] = index.get(index.size() - 1) - index.get(0);
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < index.size() - 1; i++) {
                minDiff = Math.min(minDiff, index.get(i + 1) - index.get(i));
            }
            ret[0] = minDiff;
        }

        return ret;
    }
}