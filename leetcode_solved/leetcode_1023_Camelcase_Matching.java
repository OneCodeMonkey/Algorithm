// AC: Runtime: 1 ms, faster than 54.65% of Java online submissions for Camelcase Matching.
// Memory Usage: 39.3 MB, less than 7.21% of Java online submissions for Camelcase Matching.
// set a pos to record moved index of pattern, if matches query, then forwarding one step.
// T:O(sum(queries[i].length)), S:O(queries.length)
// 
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ret = new LinkedList<>();
        for (String query:queries) {
            ret.add(check(query, pattern));
        }

        return ret;
    }

    private Boolean check(String query, String pattern) {
        int patternLen = pattern.length(), patternPos = 0, uppercaseCount = 0;
        for (int i = 0; i < query.length(); i++) {
            char c = query.charAt(i);
            if (Character.isUpperCase(c)) {
                if (patternPos < patternLen && c != pattern.charAt(patternPos)) {
                    return false;
                }
                uppercaseCount++;
                if (uppercaseCount > patternLen) {
                    return false;
                }
                patternPos++;
            } else {
                if (patternPos < patternLen && c == pattern.charAt(patternPos)) {
                    patternPos++;
                }
            }
        }

        return patternPos == patternLen;
    }
}