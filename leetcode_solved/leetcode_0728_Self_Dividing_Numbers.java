// AC:
// Runtime: 1 ms, faster than 99.69% of Java online submissions for Self Dividing Numbers.
// Memory Usage: 37.1 MB, less than 37.82% of Java online submissions for Self Dividing Numbers.
// 
// 复杂度：T：O(n), S:O(n)
// 
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                ret.add(i);
            }
        }
        return ret;
    }

    private boolean check(int num) {
        if (num < 10) {
            return true;
        }
        int raw = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                return false;
            }
            if (raw % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}