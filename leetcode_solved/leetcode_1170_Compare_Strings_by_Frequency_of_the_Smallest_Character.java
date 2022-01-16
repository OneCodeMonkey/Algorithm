// AC: Runtime: 14 ms, faster than 40.23% of Java online submissions for Compare Strings by Frequency of the Smallest Character.
// Memory Usage: 39.8 MB, less than 58.98% of Java online submissions for Compare Strings by Frequency of the Smallest Character.
// hashmap & treemap
// T:O(sum(words[i].length)), S:O(max(words[i].length))
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ret = new int[queries.length];
        TreeMap<Integer, Integer> countRecord = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        TreeMap<Character, Integer> sortWordFreq = new TreeMap<>();
        for (String word : words) {
            sortWordFreq.clear();
            for (char c : word.toCharArray()) {
                sortWordFreq.merge(c, 1, Integer::sum);
            }
            int freq = 0;
            for (char c : sortWordFreq.keySet()) {
                freq = sortWordFreq.get(c);
                break;
            }
            countRecord.merge(freq, 1, Integer::sum);
        }
        HashMap<Integer, Integer> record = new HashMap<>();
        int max = 0, smallerCount = 0;
        for (int freq : countRecord.keySet()) {
            max = freq;
            break;
        }
        for (int i = max; i >= 1; i--) {
            if (countRecord.containsKey(i)) {
                smallerCount += countRecord.get(i);
            }
            record.put(i, smallerCount);
        }

        int pos = 0;
        for (String query : queries) {
            sortWordFreq.clear();
            for (char c : query.toCharArray()) {
                sortWordFreq.merge(c, 1, Integer::sum);
            }
            int freq = 0;
            for (char c : sortWordFreq.keySet()) {
                freq = sortWordFreq.get(c);
                break;
            }
            ret[pos++] = record.getOrDefault(freq + 1, 0);
        }

        return ret;
    }
}