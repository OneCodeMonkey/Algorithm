// 基于概率的 多层链表 数据结构，查找复杂度 log(n)
// Runtime 18 ms Beats 26.53%
// Memory 53.35 MB Beats 15.10%
// implementation.
// T:O(logn), S:O(logn)
// 
class Skiplist {
    class Node {
        int val;
        Node next, down;

        Node(int val, Node next, Node down) {
            this.val = val;
            this.next = next;
            this.down = down;
        }
    }

    Node head = new Node(-1, null, null);
    Random rand = new Random();

    public Skiplist() {
        //
    }

    public boolean search(int target) {
        Node cur = head;
        while (cur != null) {
            while (cur.next != null && cur.next.val < target) {
                cur = cur.next;
            }
            if (cur.next != null && cur.next.val == target) {
                return true;
            }
            cur = cur.down;
        }

        return false;
    }

    public void add(int num) {
        Stack<Node> stack = new Stack<>();
        Node cur = head;
        while (cur != null) {
            while (cur.next != null && cur.next.val < num) {
                cur = cur.next;
            }
            stack.push(cur);
            cur = cur.down;
        }
        boolean insert = true;
        Node down = null;
        while (insert && !stack.isEmpty()) {
            cur = stack.pop();
            cur.next = new Node(num, cur.next, down);
            down = cur.next;
            insert = rand.nextDouble() < 0.5;
        }

        if (insert) {
            head = new Node(-1, null, head);
        }
    }

    public boolean erase(int num) {
        Node cur = head;
        boolean isFound = false;
        while (cur != null) {
            while (cur.next != null && cur.next.val < num) {
                cur = cur.next;
            }
            if (cur.next != null && cur.next.val == num) {
                isFound = true;
                cur.next = cur.next.next;
            }
            cur = cur.down;
        }

        return isFound;
    }
}
