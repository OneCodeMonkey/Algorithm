// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Merge In Between Linked Lists.
// Memory Usage: 42.8 MB, less than 72.32% of Java online submissions for Merge In Between Linked Lists.
// record the cut start nodes and end nodes, and concatenate them to the list2
// T:O(m + n), S:O(1)
// 
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1, list1Start, list1End;
        int aCopy = a;
        // move to the prev node by the nodes cut first.
        while (aCopy-- > 1) {
            list1 = list1.next;
        }
        list1Start = list1;
        // move the the end nodes after cut [a,b]
        int length = b - a + 2;
        while (length-- > 0) {
            list1Start = list1Start.next;
        }
        list1End = list1Start;

        list1.next = list2;
        // move list2 to its end, the point to list1's cut end node.
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = list1End;

        return head;
    }
}