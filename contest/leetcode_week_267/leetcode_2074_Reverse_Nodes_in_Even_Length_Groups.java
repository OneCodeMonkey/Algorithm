class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int groupSize = 1;
        List<List<ListNode>> record = new ArrayList<>();
        ListNode headCopy = head;
        while (headCopy != null) {
            List<ListNode> tempList = new ArrayList<>();
            for (int i = 0; i < groupSize && headCopy != null; i++) {
                tempList.add(headCopy);
                headCopy = headCopy.next;
            }
            record.add(tempList);
            groupSize++;
        }
//        for (List<ListNode> listNodes : record) {
//            for (ListNode listNode : listNodes) {
//                System.out.print(listNode.val + " ");
//            }
//            System.out.println();
//        }

        ListNode retPrev = new ListNode(-1), ret = retPrev;
        for (List<ListNode> listNodes : record) {
            if (listNodes.size() % 2 == 0) {
                Collections.reverse(listNodes);

//                for (ListNode listNode : listNodes) {
//                    System.out.print("reverse:" + listNode.val + " ");
//                }
//                System.out.println();
            }
            for (ListNode listNode : listNodes) {
                ret.next = listNode;
//                System.out.print("single val: " + listNode.val + " ");
                ret = ret.next;
            }
        }
        ret.next = null;

        return retPrev.next;
    }
}