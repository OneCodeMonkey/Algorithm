// AC: Runtime: 1 ms, faster than 77.98% of Java online submissions for Crawler Log Folder.
// Memory Usage: 38.7 MB, less than 35.52% of Java online submissions for Crawler Log Folder.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> record = new Stack<>();
        for (String str: logs) {
            if (str.equals("../")) {
                if (!record.empty()) {
                    record.pop();
                }
            } else if (str.equals("./")) {
            } else {
                record.push("x");
            }
        }
        return record.size();
    }
}