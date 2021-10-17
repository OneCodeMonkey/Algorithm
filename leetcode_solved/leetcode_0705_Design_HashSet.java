// AC: Runtime: 16 ms, faster than 55.67% of Java online submissions for Design HashSet.
// Memory Usage: 48 MB, less than 39.43% of Java online submissions for Design HashSet.
// using an array of listNode. refer to hashMap, we need to change Listnode, remove the value attribute.
// T:O(1) ~ O(k), S:O(capacity),  k is collision value.
// 
class ListNode {
    int key;
    ListNode next;

    ListNode(int key) {
        this.key = key;
    }
}

class MyHashSet {
    public ListNode[] nodes;
    private int capacity;
    // use to enlarge size.
    private float loadFactor;

    public MyHashSet() {
        capacity = (int)1e6;
        nodes = new ListNode[capacity];
    }

    private int hashIndex(int key) {
        return Integer.hashCode(key) % capacity;
    }

    private ListNode find(ListNode node, int key) {
        ListNode head = node, prev = null;
        while (head != null && head.key != key) {
            prev = head;
            head = head.next;
        }

        return prev;
    }

    public void add(int key) {
        int index = hashIndex(key);
        if (nodes[index] == null) {
            nodes[index] = new ListNode(-1);
            nodes[index].next = new ListNode(key);
        } else {
            ListNode prev = find(nodes[index], key);
            // not find.
            if (prev.next == null) {
                prev.next = new ListNode(key);
            }
        }
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

    public boolean contains(int key) {
        int index = hashIndex(key);
        if (nodes[index] == null) {
            return false;
        }
        ListNode prev = find(nodes[index], key);
        return prev.next != null;
    }
}