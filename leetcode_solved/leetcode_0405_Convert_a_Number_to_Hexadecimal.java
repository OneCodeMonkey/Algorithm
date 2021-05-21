// AC: Runtime: 5 ms, faster than 27.33% of Java online submissions for Convert a Number to Hexadecimal.
// Memory Usage: 36.7 MB, less than 27.77% of Java online submissions for Convert a Number to Hexadecimal.
// 特别注意，n 的范围是 -2^31 - 2^31 - 1， 所以特殊情况当 n = -2^31 时要单独处理
// T:O(log16(n)), S:O(log16(n))
// 
class Solution {
    public String toHex(int num) {
        StringBuilder ret = new StringBuilder();
        if (num == 0) {
            return "0";
        } else if (num > 0) {
            while (num > 0) {
                String temp = num % 16 < 10 ? String.valueOf(num % 16) : String.valueOf((char)(num % 16 - 10 + 'a'));
                ret.append(temp);
                num /= 16;
            }
        } else {
            // notice, when n = -2^31, you can't do this
            if (num == -2147483648) {
                return "80000000";
            }

            num = -num;
            // 取反
            List<Integer> bit = new LinkedList<>();
            while (num > 0) {
                bit.add(15 - num % 16);
                System.out.println("nega:" + (15 - num % 16));
                num /= 16;
            }
            int suffix = 8 - bit.size();
            for (int i = 0; i < suffix; i++) {
                bit.add(15);
            }
            // 加1
            int forward = 1;
            String temp;
            for (Integer i : bit) {
                int bitNum = i + forward;
                if (bitNum >= 16) {
                    forward = 1;
                    temp = (bitNum - 16) < 10 ? String.valueOf(bitNum - 16) : String.valueOf((char) (bitNum - 16 - 10 + 'a'));
                    ret.append(temp);
                } else {
                    forward = 0;
                    temp = (bitNum) < 10 ? String.valueOf(bitNum) : String.valueOf((char) (bitNum - 10 + 'a'));
                    ret.append(temp);
                }
            }
        }

        return ret.reverse().toString();
    }
}