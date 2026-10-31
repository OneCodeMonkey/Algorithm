// Runtime 1 ms Beats 76.35% 
// Memory 44.12 MB Beats 40.68%
// 注意说的是不限次数，允许马字跳偶数次，规律就是发现 dX+dY 为偶数
// T:O(1), S:O(1)
// 
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int diffX = Math.abs(start[0] - target[0]), diffY = Math.abs(start[1] - target[1]);

        return (diffX + diffY) % 2 == 0;
    }
}
