// AC: Runtime: 17 ms, faster than 63.07% of Java online submissions for Repeated Substring Pattern.
// Memory Usage: 39.7 MB, less than 42.85% of Java online submissions for Repeated Substring Pattern.
// find the base divider which contains every character, and check whether the k * substring can make string
// T:O(n ^ n / k), k >= 2, k is base construct substring with every char. S:O(n)
//
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c: s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }

        // get the GCD of every char occurrence times, and GCD must >= 2.
        HashSet<Integer> occurTimes = new HashSet<>();
        for (char c: record.keySet()) {
            int time = record.get(c);
            if (time == 1) {
                return false;
            }
            occurTimes.add(time);
        }

        int gcd = getGcd(occurTimes);

        // no common divider >= 2
        if (gcd == 0) {
            return false;
        }
        int repeatLen = s.length() / gcd;

        // check whether repeated by substring of length repeatLen or repeatLen * k;
        for (int len = repeatLen; len <= s.length() / 2; len += repeatLen) {
            if (s.length() % len != 0) {
                continue;
            }
            boolean flag = true;
            for (int i = 0; i < s.length() / len - 1; i++) {
                String temp1 = s.substring(i * len, (i + 1) * len);
                String temp2 = s.substring((i + 1) * len, (i + 2) * len);
                if (!temp1.equals(temp2)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return true;
            }
        }

        return false;
    }

    private int getGcd(HashSet<Integer> nums) {
        boolean isAllOdd = true;
        int minValue = Integer.MAX_VALUE;
        for (int i: nums) {
            if (i % 2 == 0) {
                isAllOdd = false;
            }
            minValue = Math.min(minValue, i);
        }

        if (isAllOdd) {
            for (int i = minValue; i >= 2; i -= 2) {
                boolean flag = true;
                for (int j: nums) {
                    if (j % i != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
        } else {
            for (int i = minValue; i >= 2; i--) {
                boolean flag = true;
                for (int j: nums) {
                    if (j % i != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
        }

        return 0;
    }
}