// Solution 1: Brute-force & prefix sum.
// Runtime 14 ms Beats 6.72% of users with Java
// Memory 44.88 MB Beats 5.93% of users with Java
// Hashmap, prefix sum, brute-foce
// T:O(n ^ 2), S:O(n)
// 
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode headCopy = head;
        while (headCopy != null) {
            nodes.add(headCopy);
            headCopy = headCopy.next;
        }

        while (true) {
            HashMap<Integer, Integer> record = new HashMap<>();
            record.put(0, 0);
            int count = 0, sum = 0;
            boolean changed = false;
            for (int i = 0; i < nodes.size(); i++) {
                sum += nodes.get(i).val;
                count++;
                if (record.containsKey(sum)) {
                    int indexStart = record.get(sum);
                    nodes.subList(indexStart, count).clear();
                    changed = true;
                    break;
                }
                record.putIfAbsent(sum, count);
            }

            if (!changed) {
                break;
            }
        }

        if (nodes.isEmpty()) {
            return null;
        }

        ListNode ret = nodes.get(0);
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }
        nodes.get(nodes.size() - 1).next = null;

        return ret;
    }
}


// Solution 2: todo
// 