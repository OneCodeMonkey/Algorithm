// AC: Runtime: 1 ms, faster than 86.22% of Java online submissions for Can Place Flowers.
// Memory Usage: 40.4 MB, less than 61.09% of Java online submissions for Can Place Flowers.
// 略。
// T:O(n), S:O(1)
// 
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int ret = 0, size = flowerbed.length;
        if (size == 1) {
            return flowerbed[0] == 0;
        }
        for (int i = 0; i < size; i++) {
            if (flowerbed[i] != 1) {
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        ret++;
                        flowerbed[0] = 1;
                    }
                } else if (i == size - 1) {
                    if (flowerbed[size - 2] == 0) {
                        ret++;
                        flowerbed[size - 1] = 1;
                    }
                } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    ret++;
                    flowerbed[i] = 1;
                }
            }
        }
        return ret >= n;
    }
}
