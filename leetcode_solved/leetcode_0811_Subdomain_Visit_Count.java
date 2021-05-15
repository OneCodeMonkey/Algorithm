// AC:
// Runtime: 16 ms, faster than 64.57% of Java online submissions for Subdomain Visit Count.
// Memory Usage: 40 MB, less than 50.35% of Java online submissions for Subdomain Visit Count.
// 略。
// T:O(n), S:O(n)
//
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> record = new HashMap<>();
        List<String> ret = new LinkedList<>();
        for (String cpdomain: cpdomains) {
            String[] arr = cpdomain.split(" ");
            Integer time = Integer.parseInt(arr[0]);
            String[] arr2 = arr[1].split("\\.");
            record.merge(arr[1], time, Integer::sum);
            record.merge(arr2[arr2.length - 1], time, Integer::sum);
            if (arr2.length == 3) {
                record.merge(arr2[1] + "." + arr2[2], time, Integer::sum);
            }
        }
        for (String item: record.keySet()) {
            Integer time = record.get(item);
            ret.add(time + " " + item);
        }

        return ret;
    }
}