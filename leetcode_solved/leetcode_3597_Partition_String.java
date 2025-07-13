// Solution1: brute-force.
// Runtime 178 ms Beats 54.41% 
// Memory 55.81 MB Beats 57.35%
// Set | brute-force.
// T:O(n * sqrt(n)), S:O(n)
// 
class Solution {
    public List<String> partitionString(String s) {
        HashSet<String> record = new HashSet<>();
        List<String> ret = new ArrayList<>();
        int maxLen = 0, cur = 0;
        StringBuilder curStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            curStr.append(s.charAt(i));
            if (curStr.length() > maxLen) {
                record.add(curStr.toString());
                ret.add(curStr.toString());
                maxLen = curStr.length();
                curStr = new StringBuilder();
            } else {
                if (!record.contains(curStr.toString())) {
                    record.add(curStr.toString());
                    ret.add(curStr.toString());
                    curStr = new StringBuilder();
                }
            }
        }

        return ret;
    }
}

// todo:
// Solution2: more efficient.
// 