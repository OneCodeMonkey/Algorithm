// AC: Runtime 3 ms Beats 100%
// Memory 43.7 MB Beats 66.67%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        int len = words.size(), continousPrev = 0;
        List<Integer> integers = new ArrayList<>(), ret = new LinkedList<>();
        for (String word : words) {
            if (word.equals("prev")) {
                continousPrev++;
                if (continousPrev > integers.size()) {
                    ret.add(-1);
                } else {
                    ret.add(integers.get(integers.size() - continousPrev));
                }
            } else {
                integers.add(Integer.parseInt(word));
                continousPrev = 0;
            }
        }

        return ret;
    }
}
