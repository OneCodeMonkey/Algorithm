// AC: Runtime: 7 ms, faster than 22.78% of Java online submissions for Top K Frequent Words.
// Memory Usage: 39.2 MB, less than 51.35% of Java online submissions for Top K Frequent Words.
// using treemap to sort frequency
// T:O(nlogn), S:O(n)
//
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ret = new LinkedList<>();
        HashMap<String, Integer> record = new HashMap<>();
        for (String word: words) {
            record.merge(word, 1, Integer::sum);
        }
        // 倒序输出
        TreeMap<Integer, List<String>> timeToString = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (String str: record.keySet()) {
            int time = record.get(str);
            if (timeToString.containsKey(time)) {
                timeToString.get(time).add(str);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                timeToString.put(time, tempList);
            }
        }

        for (int time: timeToString.keySet()) {
            List<String> list = timeToString.get(time);
            if (list.size() > 1) {
                Collections.sort(list);
            }
            if (ret.size() + list.size() <= k) {
                ret.addAll(list);
            } else {
                int curSize = ret.size();
                for (int i = 0; i < k - curSize; i++) {
                    ret.add(list.get(i));
                }
            }
        }

        return ret;
    }
}