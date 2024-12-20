// AC: Runtime 213 ms Beats 9.32%
// Memory 46.55 MB Beats 7.50%
// Greedy & Heap.
// T:O(nlogk), S:O(k), k = unique char count
// 
class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        TreeMap<Character, Integer> charCount = new TreeMap<>(Comparator.reverseOrder());
        StringBuilder ret = new StringBuilder();
        for (char c : s.toCharArray()) {
            charCount.merge(c, 1, Integer::sum);
        }
        int cur = 0;
        char prev = ' ';
        while (!charCount.isEmpty()) {
            char top = ' ', top2 = ' ';
            if (charCount.size() > 1) {
                for (char c : charCount.keySet()) {
                    if (top == ' ') {
                        top = c;
                    } else {
                        top2 = c;
                        break;
                    }
                }
            } else {
                for (char c : charCount.keySet()) {
                    top = c;
                    break;
                }
            }
            if (top == prev) {
                if (cur + 1 > repeatLimit) {
                    if (charCount.size() == 1) {
                        break;
                    } else {
                        ret.append(top2);
                        cur = 1;
                        charCount.merge(top2, -1, Integer::sum);
                        if (charCount.get(top2) == 0) {
                            charCount.remove(top2);
                        }
                        prev = top2;
                    }
                } else {
                    ret.append(top);
                    cur++;
                    charCount.merge(top, -1, Integer::sum);
                    if (charCount.get(top) == 0) {
                        charCount.remove(top);
                    }
                    prev = top;
                }
            } else {
                ret.append(top);
                cur = 1;
                charCount.merge(top, -1, Integer::sum);
                if (charCount.get(top) == 0) {
                    charCount.remove(top);
                }
                prev = top;
            }
        }

        return ret.toString();
    }
}
