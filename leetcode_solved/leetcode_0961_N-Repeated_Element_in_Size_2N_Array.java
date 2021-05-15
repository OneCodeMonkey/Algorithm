// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
// Memory Usage: 39.8 MB, less than 57.40% of Java online submissions for N-Repeated Element in Size 2N Array.
// 
// 思路：考虑不使用 O(n) 空间的做法。想到位运算中的异或运算：只有当 a = b 时， a^b == 0，利用这点可以解决此题。
//      由于 一般以上都是 重复 N 次的数字，我们每次随机取两个数进行判断，理论上平均只需要 4 次就能找到这个数
// 复杂度：T：avg:O(1)  max:无限大， S:O(1)
// 
class Solution {
    public int repeatedNTimes(int[] nums) {
        int size = nums.length, rand1, rand2;
        Random rand = new Random();
        while (true) {
            rand1 = rand.nextInt(size);
            rand2 = rand.nextInt(size);
            if (rand1 != rand2 && (nums[rand1] ^ nums[rand2]) == 0) {
                return nums[rand1];
            }
        }
    }
}