// Runtime 1 ms Beats 100.00% 
// Memory 45.03 MB Beats -%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ret = 0, prev = -1;
        for (int i : requests) {
            if (prev == -1) {
                ret += i;
            } else {
                ret += Math.abs(prev - i);
            }
            prev = i;
        }

        return ret;
    }
}
