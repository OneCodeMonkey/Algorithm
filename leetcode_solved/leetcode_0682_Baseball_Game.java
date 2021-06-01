// AC: Runtime: 2 ms, faster than 88.14% of Java online submissions for Baseball Game.
// Memory Usage: 38.1 MB, less than 71.87% of Java online submissions for Baseball Game.
// 略。
// T:O(n), S:O(n)
// 
class Solution {
    public int calPoints(String[] ops) {
        long ret = 0;
        List<Long> record = new LinkedList<>();
        for (String str: ops) {
            switch (str) {
                case "+":
                    long temp = record.get(record.size() - 2) + record.get(record.size() - 1);
                    record.add(temp);
                    break;
                case "C":
                    record.remove(record.size() - 1);
                    break;
                case "D":
                    temp = record.get(record.size() - 1) * 2;
                    record.add(temp);
                    break;
                default:
                    record.add(Long.parseLong(str));
            }
        }
        for (long i: record) {
            ret += i;
        }

        return (int)ret;
    }
}