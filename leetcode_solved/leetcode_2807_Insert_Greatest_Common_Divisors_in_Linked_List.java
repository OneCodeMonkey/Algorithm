// AC: untime 3 ms Beats 100%
// Memory 44 MB Beats 100%
// LinkedList operation & gcd algorithm.
// T:O(n), S:O(n)
//
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer> record = new ArrayList<>();
        ListNode headCopy = head;
        while (headCopy != null) {
            record.add(headCopy.val);
            headCopy = headCopy.next;
        }
        if (record.size() == 1) {
            return head;
        }
        int pos = 0;
        headCopy = head;
        while (headCopy != null) {
            int gcd = gcd(record.get(pos), record.get(pos + 1));
            ListNode tmp = new ListNode(gcd);
            ListNode next = headCopy.next;
            headCopy.next = tmp;
            tmp.next = next;
            headCopy = next;

            if (pos == record.size() - 2) {
                break;
            }
            pos++;
        }

        return head;
    }

    private int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
