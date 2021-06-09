// AC: Runtime: 11 ms, faster than 15.95% of Java online submissions for Reorder Data in Log Files.
// Memory Usage: 39 MB, less than 92.42% of Java online submissions for Reorder Data in Log Files.
// thoughts: using treeMap to sort content and prefix.
// T:O(nlogn * mlogm), S:O(m * n), n is the distinct count of log content, m is the distinct count of log prefix
// 
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digit = new LinkedList<>();
        List<String> ret = new LinkedList<>();
        // Sort by content, then sort by log prefix
        TreeMap<String, TreeMap<String, Integer>> sort = new TreeMap<>();

        for (String log: logs) {
            int spaceIndex = log.indexOf(' ');
            String prefix = log.substring(0, spaceIndex);
            String logContent = log.substring(spaceIndex + 1, log.length());
            char c = logContent.charAt(0);
            if (c >= '0' && c <= '9') {
                digit.add(log);
            } else {
                if (sort.get(logContent) == null) {
                    TreeMap<String, Integer> temp = new TreeMap<>();
                    temp.put(prefix, 1);
                    sort.put(logContent, temp);
                } else {
                    sort.get(logContent).merge(prefix, 1, Integer::sum);
                }
            }
        }

        String[] retArr = new String[logs.length];
        int pos = 0;
        for (String logContent: sort.keySet()) {
            TreeMap<String, Integer> count = sort.get(logContent);
            for (String prefix: count.keySet()) {
                int time = count.get(prefix);
                String log = prefix + ' ' + logContent;
                while (time-- > 0) {
                    retArr[pos++] = log;
                }
            }
        }
        for (String log: digit) {
            retArr[pos++] = log;
        }

        return retArr;
    }
}