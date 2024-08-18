// Solution 1: 使用 Java Collection——ArrayDeque
// Runtime 5 ms Beats 37.32%
// Memory 45.12 MB Beats 10.55%
// Using java collection —— ArrayDeque()
// T:O(1), S:O(n)
//
class MyCircularDeque {
    private Deque<Integer> deque;
    private int maxSize;

    public MyCircularDeque(int k) {
        deque = new ArrayDeque<>(k);
        maxSize = k;
    }

    public boolean insertFront(int value) {
        if (deque.size() >= maxSize) {
            return false;
        }
        deque.addFirst(value);
        return true;
    }

    public boolean insertLast(int value) {
        if (deque.size() >= maxSize) {
            return false;
        }
        deque.addLast(value);
        return true;
    }

    public boolean deleteFront() {
        if (deque.isEmpty()) {
            return false;
        }
        deque.poll();
        return true;
    }

    public boolean deleteLast() {
        if (deque.isEmpty()) {
            return false;
        }
        deque.pollLast();
        return true;
    }

    public int getFront() {
        if (deque.isEmpty()) {
            return -1;
        }

        return deque.getFirst();
    }

    public int getRear() {
        if (deque.isEmpty()) {
            return -1;
        }

        return deque.getLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public boolean isFull() {
        return deque.size() >= maxSize;
    }
}

// Solution 2: Using raw array to implementation.
// todo-
