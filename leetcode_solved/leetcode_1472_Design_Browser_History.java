// AC: Runtime: 60 ms, faster than 41.51% of Java online submissions for Design Browser History.
// Memory Usage: 47.9 MB, less than 25.83% of Java online submissions for Design Browser History.
// Using to stack to implement.
// T:O(steps), S:O(n)
// 
class BrowserHistory {
    private Stack<String> history;
    private Stack<String> backed;

    public BrowserHistory(String homepage) {
        history = new Stack<>();
        history.push(homepage);
        backed = new Stack<>();
    }

    public void visit(String url) {
        history.push(url);
        backed.clear();
    }

    public String back(int steps) {
        while (steps-- > 0) {
            if (history.size() > 1) {
                backed.push(history.pop());
            } else {
                break;
            }
        }
        return history.peek();
    }

    public String forward(int steps) {
        while (steps-- > 0) {
            if (!backed.empty()) {
                history.push(backed.pop());
            } else {
                break;
            }
        }

        return history.peek();
    }
}