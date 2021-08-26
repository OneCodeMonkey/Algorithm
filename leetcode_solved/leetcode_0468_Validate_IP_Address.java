// AC: Runtime: 2 ms, faster than 54.06% of Java online submissions for Validate IP Address.
// Memory Usage: 38.9 MB, less than 18.51% of Java online submissions for Validate IP Address.
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String validIPAddress(String IP) {
        if (IP.length() > 39) {
            return "Neither";
        }
        if (IP.contains(".")) {
            int count = 0;
            for (char c: IP.toCharArray()) {
                if (c == '.') {
                    count++;
                }
            }
            if (count != 3) {
                return "Neither";
            }
            String[] arr = IP.split("\\.");
            if (arr.length != 4) {
                return "Neither";
            }
            for (String str: arr) {
                if (str.isEmpty() || str.length() > 3 || (str.length() > 1 && str.charAt(0) == '0')) {
                    return "Neither";
                }
                for (char c: str.toCharArray()) {
                    if (!(c >= '0' && c <= '9')) {
                        return "Neither";
                    }
                }
                if (Integer.parseInt(str) > 255) {
                    return "Neither";
                }
            }

            return "IPv4";
        } else if (IP.contains(":")) {
            int count = 0;
            for (char c: IP.toCharArray()) {
                if (c == ':') {
                    count++;
                }
            }
            if (count != 7) {
                return "Neither";
            }
            String[] arr = IP.split(":");
            if (arr.length != 8) {
                return "Neither";
            }
            for (String str: arr) {
                if (str.isEmpty() || str.length() > 4) {
                    return "Neither";
                }
                for (char c: str.toCharArray()) {
                    if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                        return "Neither";
                    }
                }
            }

            return "IPv6";
        } else {
            return "Neither";
        }
    }
}