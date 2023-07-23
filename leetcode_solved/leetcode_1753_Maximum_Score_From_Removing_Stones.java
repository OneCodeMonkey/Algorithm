// AC: Runtime 0 ms Beats 100% 
// Memory: 39.1 MB Beats 96.69%
// strategy.
// T:O(1), S:O(1)
// 
class Solution {
    public int maximumScore(int a, int b, int c) {
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        if (arr[2] >= arr[0] + arr[1]) {
            return arr[0] + arr[1];
        } else {
            return (a + b + c) / 2;
        }
    }
}
