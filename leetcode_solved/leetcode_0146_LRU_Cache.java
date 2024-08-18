// AC: Runtime: 46 ms, faster than 89.97% of Java online submissions for LRU Cache.
// Memory Usage: 109.2 MB, less than 87.04% of Java online submissions for LRU Cache.
// implement with java's native LinkedHashMap container.
// T:O(1), S:O(n)
//
class LRUCache {
    private HashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}


// Solution 2: Raw implementation: hashmap + double-linked list.
// Runtime 42 ms Beats 89.61%
// Memory 111.00 MB Beats 95.84%
// hashmap + double-linked list.
// T:O(1), S:O(n)
// 
class LRUCache {
    HashMap<Integer, LinkedNode> cache = new HashMap<>();
    private int count, capacity;
    LinkedNode head, tail;

    class LinkedNode {
        int key;
        int value;
        LinkedNode prev;
        LinkedNode post;
    }

    /**
     * add to head
     *
     * @param node
     */
    private void addNode(LinkedNode node) {
        node.prev = head;
        node.post = head.post;
        head.post.prev = node;
        head.post = node;
    }

    /**
     * remove from double-linked list
     *
     * @param node
     */
    private void removeNode(LinkedNode node) {
        LinkedNode prevNode = node.prev;
        LinkedNode postNode = node.post;
        prevNode.post = postNode;
        postNode.prev = prevNode;
    }

    /**
     * move node to head
     *
     * @param node
     */
    private void moveToHead(LinkedNode node) {
        removeNode(node);
        addNode(node);
    }

    /**
     * move tail node
     *
     * @return
     */
    private LinkedNode popTail() {
        LinkedNode res = tail.prev;
        removeNode(res);

        return res;
    }

    public LRUCache(int capacity) {
        count = 0;
        this.capacity = capacity;

        head = new LinkedNode();
        tail = new LinkedNode();

        head.post = tail;
        tail.prev = head;
    }

    public int get(int key) {
        LinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        LinkedNode node = cache.get(key);
        if (node == null) {
            LinkedNode newNode = new LinkedNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            addNode(newNode);

            count++;
            // check if full
            if (count > capacity) {
                LinkedNode tailNode = popTail();
                cache.remove(tailNode.key);
                count--;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }
}
