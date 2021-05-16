// AC: Runtime: 2 ms, faster than 93.41% of Java online submissions for DI String Match.
// Memory Usage: 40.2 MB, less than 49.11% of Java online submissions for DI String Match.
// 观察规律，发现出现 I 时就从 0 开始往上加，出现 D 是就从 n 开始往下减，依次添加出来的结果是一种满足条件的解。
//     （但貌似可以证明这是唯一的解，当为0到n的全排列时）
// T:O(n), S:O(n)
// 
class Solution {
    public int[] diStringMatch(String s) {
        int size = s.length(), left = 0, right = size;
        int[] ret = new int[size + 1];
        for (int i = 0; i < size; i++) {
            ret[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        ret[size] = left;

        return ret;
    }
}