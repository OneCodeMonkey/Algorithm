// AC: Runtime: 20 ms, faster than 70.00% of Java online submissions for Sort the People.
// Memory Usage: 54.6 MB, less than 80.00% of Java online submissions for Sort the People.
// TreeMap
// T:O(nlogn), S:O(n)
// 
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> record = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int pos = 0;
        for (int height : heights) {
            record.put(height, names[pos++]);
        }

        String[] ret = new String[names.length];
        pos = 0;
        for (int i : record.keySet()) {
            ret[pos++] = record.get(i);
        }

        return ret;
    }
}