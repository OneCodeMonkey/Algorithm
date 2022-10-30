// AC: Runtime 6 ms Beats 75% 
// Memory 42.5 MB Beats 50%
// .
// T:O(n * n * queries[i].length), S:O(n * queries[i].length)
// 
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        HashSet<String> set = new HashSet<>(Arrays.asList(dictionary)), checked = new HashSet<>();
        List<String> ret = new LinkedList<>();
        for (String query : queries) {
            if (checked.contains(query)) {
                ret.add(query);
                continue;
            }
            boolean flag = false;
            for (String item : set) {
                int count = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) != item.charAt(i)) {
                        count++;
                    }
                    if (count > 2) {
                        break;
                    }
                }
                if (count <= 2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                ret.add(query);
                checked.add(query);
            }
        }

        return ret;
    }
}
