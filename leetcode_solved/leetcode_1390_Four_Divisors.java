// Runtime 36 ms Beats 29.29% 
// Memory 47.17 MB Beats 14.65%
// Brute-force
// T:O(n * sqrt(n)), S:O(1)
// 
class Solution {
    public int sumFourDivisors(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            int countDividor = 0, sqrtN = (int) Math.sqrt(num);
            boolean flag = true;
            List<Integer> dividors = new ArrayList<>();
            for (int i = 2; i <= sqrtN; i++) {
                if (num % i == 0) {
                    countDividor++;
                    dividors.add(i);
                    if (i * i != num) {
                        countDividor++;
                        dividors.add(num / i);
                    }
                    if (countDividor > 2) {
                        flag = false;
                    }
                }
            }

            if (flag && countDividor == 2) {
                ret += 1 + num + dividors.get(0) + dividors.get(1);
            }
        }

        return ret;
    }
}
