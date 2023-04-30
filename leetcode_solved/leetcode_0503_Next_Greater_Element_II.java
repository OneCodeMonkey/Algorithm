// AC: Runtime 35 ms Beats 62.85% 
// Memory 44.7 MB Beats 22.74
// Monotone Stack.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] rearrange = new int[2 * len - 1], ret = new int[2 * len - 1];
        Arrays.fill(ret, -1);
        for (int i = 0; i < 2 * len - 1; i++) {
            rearrange[i] = i < len ? nums[i] : nums[i - len];
        }
        Stack<Integer> record = new Stack<>();
        for (int i = 0; i < 2 * len - 1; i++) {
            while (!record.isEmpty() && rearrange[record.peek()] < rearrange[i]) {
                ret[record.pop()] = rearrange[i];
            }
            record.push(i);
        }
        int[] ret2 = new int[len];
        System.arraycopy(ret, 0, ret2, 0, len);

        return ret2;
    }
}
