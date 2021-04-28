// AC:
// Runtime: 1 ms, faster than 99.91% of Java online submissions for Replace Elements with Greatest Element on Right Side.
// Memory Usage: 40.2 MB, less than 61.02% of Java online submissions for Replace Elements with Greatest Element on Right Side.
// 思路：原地更新更省空间，不开辟新数组。
// 复杂度：T:O(n), S:O(1)
// 
class Solution {
    public int[] replaceElements(int[] arr) {
        int size = arr.length, max = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            if (arr[size - 1] > max) {
                max = arr[size - 1];
            }
            // 用末尾值保留当前位置的值，给下一次循环提供
            arr[size - 1] = arr[i];
            arr[i] = max;
        }
        arr[size - 1] = -1;

        return arr;
    }
}