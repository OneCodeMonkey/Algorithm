// AC: Runtime: 7 ms, faster than 35.67% of Java online submissions for Restore IP Addresses.
// Memory Usage: 39.4 MB, less than 37.19% of Java online submissions for Restore IP Addresses.
// travel thought all the case of the three dots' position and check.
// T:O(3^3), s:O(1)
//
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new LinkedList<>();
        int size = s.length();

        if (size <= 12 && size >= 4) {
            for (int i = 0; i <= 3 && i < size - 3; i++) {
                if (i >= 1 && s.charAt(0) == '0') {
                    continue;
                }
                int ip1 = Integer.parseInt(s.substring(0, i + 1));
                if (ip1 > 255) {
                    continue;
                }
                for (int j = i + 1; j - i <= 3 && j < size - 2; j++) {
                    if (j - i > 1 && s.charAt(i + 1) == '0') {
                        continue;
                    }
                    int ip2 = Integer.parseInt(s.substring(i + 1, j + 1));
                    if (ip2 > 255) {
                        continue;
                    }
                    for (int k = j + 1; k - j <= 3 && k < size - 1; k++) {
                        if (k - j > 1 && s.charAt(j + 1) == '0') {
                            continue;
                        }
                        if (size - 1 - k > 3 || (size - 1 - k > 1 && s.charAt(k + 1) == '0')) {
                            continue;
                        }
                        int ip3 = Integer.parseInt(s.substring(j + 1, k + 1));
                        if (ip3 > 255) {
                            continue;
                        }
                        int ip4 = Integer.parseInt(s.substring(k + 1, size));
                        if (ip4 > 255) {
                            continue;
                        }
                        String temp = ip1 + "." + ip2 + "." + ip3 + "." + ip4;
                        ret.add(temp);
                    }
                }
            }
        }

        return ret;
    }
}