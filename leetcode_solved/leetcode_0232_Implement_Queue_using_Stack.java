// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
// Memory Usage: 37 MB, less than 29.46% of Java online submissions for Implement Queue using Stacks.
// using two stack to restore the raw input stack and the output stack which top element is firstly pushed element.
// complexity: push,pop,peek,empty: T:O(1), S:O(n)
// 
class MyQueue {
    private Stack<Integer> q1;
    private Stack<Integer> q2;

    /** Initialize your data structure here. */
    public MyQueue() {
        q1 = new Stack<>();
        q2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        q1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return q2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (q2.empty()) {
            while (!q1.empty()) {
                q2.push(q1.pop());
            }
        }
        return q2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return q1.empty() && q2.empty();
    }
}