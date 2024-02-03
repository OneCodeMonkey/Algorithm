// Runtime 5 ms Beats 97.05% of users with Java
// Memory 44.39 MB Beats 62.56% of users with Java
// Math: 逆波兰表达式，算术表达式解析
// T:O(n), S:O(1)
// 
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> record = new Stack();
        for (String token : tokens) {
            if ("+".equals(token)) {
                int a = record.pop(), b = record.pop();
                record.add(a + b);
            } else if ("-".equals(token)) {
                int a = record.pop(), b = record.pop();
                record.add(b - a);
            } else if ("*".equals(token)) {
                int a = record.pop(), b = record.pop();
                record.add(a * b);
            } else if ("/".equals(token)) {
                int a = record.pop(), b = record.pop();
                record.add(b / a);
            } else {
                record.add(Integer.parseInt(token));
            }
        }

        return record.peek();
    }
}
