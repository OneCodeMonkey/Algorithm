// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Copy List with Random Pointer.
// Memory Usage: 38.3 MB, less than 90.21% of Java online submissions for Copy List with Random Pointer.
// first copy list with original values, and record the original node - new node mapping relations. then assign next and random to new list.
// T:O(n), S:O(n)
// 
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> mapping = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            mapping.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            mapping.get(temp).next = mapping.get(temp.next);
            mapping.get(temp).random = mapping.get(temp.random);
            temp = temp.next;
        }

        return mapping.get(head);
    }
}