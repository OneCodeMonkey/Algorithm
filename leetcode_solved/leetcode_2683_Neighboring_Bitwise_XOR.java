// AC: Runtime 3 ms Beats 100%
//  Memory 52 MB Beats 16.67%
// We can prove that when xor sum of elements are equal to 0, then the answer exists.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xorSum = 0;
        for (int i : derived) {
            xorSum ^= i;
        }

        return xorSum == 0;
    }
}
