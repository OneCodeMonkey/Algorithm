// Solution 2: Slide-window thoughts
// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Gas Station.
// Memory Usage: 38.5 MB, less than 99.73% of Java online submissions for Gas Station.
// thoughts: like array slide-windows method
// T:O(n), S:O(1)
// 
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int size = gas.length, start = size - 1, end = 0, sum = gas[start] - cost[start];
        while (start > end) {
            if (sum >= 0) {
                // end pos move to right,
                sum += gas[end] - cost[end];
                end++;
            } else {
                // start pos move to left, judge if sum can be positive,
                start--;
                sum += gas[start] - cost[start];
            }
        }

        return sum < 0 ? -1 : start;
    }
}

// Solution 1: brute-force, O(n^2) time
// AC: Runtime: 56 ms, faster than 15.68% of Java online submissions for Gas Station.
// Memory Usage: 39 MB, less than 81.69% of Java online submissions for Gas Station.
// brute-force 
// T:O(n^2), S:O(1)
// 
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int size = gas.length;
        for (int i = 0; i < size; i++) {
            if (gas[i] < cost[i]) {
                continue;
            }
            int tempRemainGas = 0;
            boolean flag = true;
            for (int j = 0; j < size; j++) {
                int index = (i + j) % size;
                tempRemainGas += gas[index] - cost[index];
                if (tempRemainGas < 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                continue;
            }
            return i;
        }
        return -1;
    }
}