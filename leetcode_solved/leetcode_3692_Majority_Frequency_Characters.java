// Runtime 10 ms Beats 8.64% 
// Memory 44.63 MB Beats 24.78%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : s.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        HashMap<Integer, List<Character>> record2 = new HashMap<>();
        int maxSize = 0, maxSizeFreq = 0;
        for (char c : record.keySet()) {
            int time = record.get(c);
            if (!record2.containsKey(time)) {
                record2.put(time, new ArrayList<>());
            }
            record2.get(time).add(c);
        }
        List<Character> maxFreqRet = new ArrayList<>();
        for (int time : record2.keySet()) {
            int listSize = record2.get(time).size();
            if (listSize > maxSize) {
                maxSize = listSize;
                maxSizeFreq = time;
                maxFreqRet = record2.get(time);
            } else if (listSize == maxSize) {
                if (time > maxSizeFreq) {
                    maxSizeFreq = time;
                    maxFreqRet = record2.get(time);
                }
            }
        }

        return maxFreqRet.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
