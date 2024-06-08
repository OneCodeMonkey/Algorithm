// Runtime 3 ms Beats 20.13% of users with Java
// Memory 41.17 MB Beats 70.44% of users with Java
// Implementation.
// T:O(n), S:O(n)
// 
class Solution {
    public int numSteps(String s) {
        int len = s.length(), ret = 0;
        List<Integer> digits = new ArrayList<>(len);
        for (char c : s.toCharArray()) {
            digits.add(c - '0');
        }
        for (int i = len - 1; i >= 0; i--) {
            if (digits.get(i) == 0) {
                ret++;
            } else {
                if (i == 0) {
                    continue;
                }
                int j = i;
                while (j - 1 >= 0 && digits.get(j - 1) == 1) {
                    j--;
                }
                for (int k = j; k <= i; k++) {
                    digits.set(k, 0);
                }
                if (j > 0) {
                    digits.set(j - 1, 1);
                }
                ret++;
                i++;
            }
        }

        return ret;
    }
}
