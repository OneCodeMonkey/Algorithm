// Runtime 0 ms Beats 100.00% of users with Java
// Memory 39.98 MB Beats 66.67% of users with Java
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, x1 = x;
        while (x1 > 0) {
            sum += x1 % 10;
            x1 /= 10;
        }

        return x % sum == 0 ? sum : -1;
    }
}
