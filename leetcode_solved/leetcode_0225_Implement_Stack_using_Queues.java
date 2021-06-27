// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Stack using Queues.
// Memory Usage: 37.2 MB, less than 19.48% of Java online submissions for Implement Stack using Queues.
// every inserting MyStack means push to tail of queue, and then rotate the queue so that newly pushed element is on the front of queue.
// complexity: push: T:O(n)
// 
class MyStack {
    private Queue<Integer> q;

    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int rawSize = q.size();
        q.offer(x);
        for (int i = 0; i < rawSize; i++) {
            q.offer(q.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}