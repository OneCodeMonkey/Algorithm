// AC: Runtime: 9 ms, faster than 72.03% of Java online submissions for Unique Email Addresses.
// Memory Usage: 38.9 MB, less than 88.40% of Java online submissions for Unique Email Addresses.
// .
// T:O(n), S:O(n)
//
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> ret = new HashSet<>();
        for (String rawEmail: emails) {
            StringBuilder temp = new StringBuilder();
            boolean reachAt = false, meetPlus = false;
            for (int i = 0; i < rawEmail.length(); i++) {
                if (!reachAt) {
                    if (rawEmail.charAt(i) == '.') {
                        continue;
                    }
                    if (rawEmail.charAt(i) == '+') {
                        meetPlus = true;
                        continue;
                    }
                    if (rawEmail.charAt(i) == '@') {
                        reachAt = true;
                        temp.append('@');
                        continue;
                    }
                    if (!meetPlus) {
                        temp.append(rawEmail.charAt(i));
                    }
                } else {
                    temp.append(rawEmail.charAt(i));
                }
            }
            ret.add(temp.toString());
        }
        return ret.size();
    }
}