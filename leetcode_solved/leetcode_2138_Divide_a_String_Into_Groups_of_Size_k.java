// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Divide a String Into Groups of Size k.
// Memory Usage: 39.2 MB, less than 50.00% of Java online submissions for Divide a String Into Groups of Size k.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> record = new LinkedList<>();
        int len = s.length();
        StringBuilder temp;
        for (int i = 0; i < len / k; i++) {
            temp = new StringBuilder();
            for (int j = i * k; j < (i + 1) * k; j++) {
                temp.append(s.charAt(j));
            }
            record.add(temp.toString());
        }
        if (len % k != 0) {
            temp = new StringBuilder();
            for (int i = (len / k) * k; i < (len / k + 1) * k; i++) {
                if (i < len) {
                    temp.append(s.charAt(i));
                } else {
                    temp.append(fill);
                }
            }
            record.add(temp.toString());
        }
        String[] ret = new String[record.size()];
        int pos = 0;
        for (String str: record) {
            ret[pos++] = str;
        }

        return ret;
    }
}