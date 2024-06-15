// Solution 1: Brute-force 暴力解法
// Runtime 198 ms Beats 100.00% of users with Java
// Memory 40.65 MB Beats 100.00% of users with Java
// Brute-force.
// T:O(n * k), S:O(1)
// 
class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 0; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                arr[j] = (arr[j] + arr[j - 1]) % (1_000_000_000 + 7);
            }
        }

        return arr[n - 1];
    }
}


// Solution 2: 杨辉三角通项公式
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1
// 1 6 15 20 15 6 1
// 1 7 21 35 35 21 7 1
// 1 8 28 56 70 56 28 8 1
// 

// 结论：combination(k+n-1,n-1)
// todo-补充理解思路，没搞懂