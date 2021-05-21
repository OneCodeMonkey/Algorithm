// AC: Runtime: 6 ms, faster than 45.42% of Java online submissions for Perfect Number.
// Memory Usage: 36.1 MB, less than 10.07% of Java online submissions for Perfect Number.
// 从 sqrt(n) 开始遍历，奇数可以 step = 2 往下减
// T:O(sqrt(n)), S:O(1)
// 
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 0, start = (int) Math.floor(Math.sqrt(num)), step = 1;
        if (num % 2 == 1) {
            if (start % 2 == 1){
                step = 2;
            } else {
                start -= 1;
            }
        }
        while (start > 0) {
            if (num % start == 0) {
                if (start != 1 && num / start != start) {
                    sum += start;
                    sum += num / start;
                } else {
                    System.out.println("4" + start);
                    sum += start;
                }
            }
            start -= step;
        }
        if (sum == num) {
            return true;
        }

        return false;
    }
}
