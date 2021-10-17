// AC: Runtime: 20 ms, faster than 57.28% of Java online submissions for Design HashMap.
// Memory Usage: 46.6 MB, less than 54.66% of Java online submissions for Design HashMap.
// using List Array to store. and using hashCode to get array index. every array element point to a linked-list.
// T:O(1) ~ O(k), S:O(n), k 为发生hash碰撞时的链表存储长度
//
class ListNode {
    int key;
    int val;
    ListNode next;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {
    public ListNode[] nodes;
    private final int capacity;
    // use to enlarge size.
    private float loadFactor;

    public MyHashMap() {
        capacity = (int) 1e6;
        nodes = new ListNode[capacity];
    }

    private int hashIndex(int num) {
        return Integer.hashCode(num) % capacity;
    }

    public void put(int key, int value) {
        int index = hashIndex(key);
        if (nodes[index] == null) {
            // 数组指向联表的头节点，设置一个空节点，方便删除后也能索引到这个空节点
            nodes[index] = new ListNode(-1, -1);
            nodes[index].next = new ListNode(key, value);
        } else {
            ListNode prev = find(nodes[index], key);
            prev.next = new ListNode(key, value);
        }
    }

    private ListNode find(ListNode node, int key) {
        ListNode head = node, prev = null;
        while (head != null && head.key != key) {
            prev = head;
            head = head.next;
        }

        return prev;
    }

    public int get(int key) {
        int index = hashIndex(key);
        if (nodes[index] == null) {
            return -1;
        }
        ListNode prev = find(nodes[index], key);
        return prev.next == null ? -1 : prev.next.val;
    }

    public void remove(int key) {
        int index = hashIndex(key);
        if (nodes[index] == null) {
            return;
        }
        ListNode prev = find(nodes[index], key);
        if (prev.next == null) {
            return;
        }
        prev.next = prev.next.next;
    }
}