// AC: Runtime: 10 ms, faster than 43.77% of Java online submissions for Sort Integers by The Number of 1 Bits.
// Memory Usage: 39.2 MB, less than 89.10% of Java online submissions for Sort Integers by The Number of 1 Bits.
// 计算二进制 1-bit，然后对二维数组排序
// T:O(nlogn), S:O(n)
// 
class Solution {
    public int[] sortByBits(int[] arr) {
        int size = arr.length;
        int[][] record = new int[size][2];
        Arrays.sort(arr);
        HashMap<Integer, Integer> cache = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i], countBit = 0;
            if (cache.get(temp) != null) {
                countBit = cache.get(temp);
            } else {
                while (temp > 0) {
                    if (temp % 2 == 1) {
                        countBit++;
                    }
                    temp = temp >> 1;
                }
                cache.put(arr[i], countBit);
            }
            record[i] = new int[]{i, countBit};
        }
        Arrays.sort(record, (a, b) -> (a[1] - b[1]));
        int[] ret = new int[arr.length];
        for (int i = 0; i < size; i++) {
            ret[i] = arr[record[i][0]];
        }

        return ret;
    }
}