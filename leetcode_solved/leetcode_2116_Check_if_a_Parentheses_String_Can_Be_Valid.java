// Runtime 24 ms Beats 14.52% 
// Memory 46.74 MB Beats 5.81%
// Stack: 使用两个 stack，优先使用自身的 () 配对，其次用 0 字符位置的动态位去凑对，最后看多出来的 ( 是否可用 0 字符动态位置凑对完。
// T:O(n), S:O(n)
// 
class Solution {
    /**
     * 双stack 思想，优先用自带的 ()来凑对，其次用 0 字符位置的动态位去凑对，最后看多出来的 ( 是否可用 0 字符动态位置凑对完。
     *
     * @param s
     * @param locked
     * @return
     */
    public boolean canBeValid(String s, String locked) {
        int len = s.length();
        if (len % 2 == 1) {
            return false;
        }

        Stack<Integer> self = new Stack<>(), dynamic = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i), c1 = locked.charAt(i);
            if (c1 == '0') {
                dynamic.push(i);
            } else if (c == '(') {
                self.push(i);
            } else if (c == ')') {
                if (!self.isEmpty()) {
                    self.pop();
                } else if (!dynamic.isEmpty()) {
                    dynamic.pop();
                } else {
                    return false;
                }
            }
        }

        while (!self.isEmpty() && !dynamic.isEmpty() && dynamic.peek() > self.peek()) {
            self.pop();
            dynamic.pop();
        }

        return self.isEmpty();
    }
}
