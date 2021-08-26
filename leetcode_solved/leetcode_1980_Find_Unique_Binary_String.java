// AC: Runtime: 1 ms, faster than 80.00% of Java online submissions for Find Unique Binary String.
// Memory Usage: 36.9 MB, less than 60.00% of Java online submissions for Find Unique Binary String.
// .
// T:O(n), S:O(n)
//
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> record = new HashSet<>();
        for (String str: nums) {
            record.add(binaryToInt(str));
        }
        int powN = (int) Math.pow(2, nums.length), ret = 0;
        for (int i = 0; i < powN; i++) {
            if (!record.contains(i)) {
                ret = i;
                break;
            }
        }

        return intToBinary(ret, nums[0].length());
    }

    private int binaryToInt(String str) {
        int ret = 0, exp = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            ret += ((c == '1') ? 1 : 0) * exp;
            exp *= 2;
        }

        return ret;
    }

    private String intToBinary(int num, int len) {
        StringBuilder ret = new StringBuilder();
        while (num > 0) {
            ret.append(num % 2);
            num /= 2;
        }
        for (int i = ret.length() + 1; i <= len; i++) {
            ret.append('0');
        }

        return ret.reverse().toString();
    }
}