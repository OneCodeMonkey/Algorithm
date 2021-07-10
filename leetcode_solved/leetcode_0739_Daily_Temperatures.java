// 方法一：原始暴力，可以pass。。
// Runtime: 977 ms, faster than 10.10% of Java online submissions for Daily Temperatures.
// Memory Usage: 47.1 MB, less than 54.24% of Java online submissions for Daily Temperatures.
// 略。
// T:O(n^2), S:O(n)
//
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ret = new int[T.length];
        ret[T.length - 1] = 0;

        for (int i = 0; i < T.length - 1; i++) {
            int count = 0;
            boolean hasBigger = false;
            for (int j = i + 1; j < T.length; j++) {
                count++;
                if (T[j] > T[i]) {
                    hasBigger = true;
                    break;
                }
            }
            if (hasBigger) {
                ret[i] = count;
            }
        }

        return ret;
    }
}

// 优化：单调栈解法
// AC: Runtime: 40 ms, faster than 30.34% of Java online submissions for Daily Temperatures.
// Memory Usage: 48.3 MB, less than 54.37% of Java online submissions for Daily Temperatures.
// 单调栈解法
// T:O(n), S:O(n)
// 
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> record = new Stack<>();
        int size = temperatures.length;
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            if (record.empty() || temperatures[i] <= temperatures[record.peek()]) {
                record.push(i);
            } else {
                while (!record.empty() && temperatures[i] > temperatures[record.peek()]) {
                    ret[record.peek()] = i - record.peek();
                    record.pop();
                }
                record.push(i);
            }
        }

        return ret;
    }
}