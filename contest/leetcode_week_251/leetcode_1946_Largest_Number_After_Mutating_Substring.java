// AC
class Solution {
    public String maximumNumber(String num, int[] change) {
        int size = num.length();
        StringBuilder ret = new StringBuilder();
        boolean started = false, stopped = false, everChanged = false;
        for (int i = 0; i < size; i++) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (change[digit] >= digit && !stopped) {
                started = true;
                ret.append(change[digit]);
                if (change[digit] > digit) {
                    everChanged = true;
                }
            } else {
                ret.append(digit);
                if (started && everChanged) {
                    stopped = true;
                }
            }
        }

        return ret.toString();
    }
}