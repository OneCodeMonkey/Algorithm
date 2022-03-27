// AC: Runtime: 10 ms, faster than 28.18% of Java online submissions for Partition Labels.
// Memory Usage: 42.5 MB, less than 55.05% of Java online submissions for Partition Labels.
// start from 0-index, record the max substring that meets the requirement, until reach the end of string.
// T:O(n), S:O(1)
// 
class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ret = new LinkedList<>();
        int size = S.length();
        HashMap<Character, List<Integer>> charIndex = new HashMap<>();
        for (int i = 0; i < size; i++) {
            char c = S.charAt(i);
            if (charIndex.get(c) != null) {
                if (charIndex.get(c).size() == 1) {
                    charIndex.get(c).add(i);
                } else {
                    charIndex.get(c).set(1, i);
                }
            } else {
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                charIndex.put(c, temp);
            }
        }

        // one char's first occur index and last occur index
        int startPos = 0, endPos = 0;
        while (startPos < size) {
            char c = S.charAt(startPos);
            List<Integer> tempIndex = charIndex.get(c);
            // appear only once
            if (tempIndex.size() == 1) {
                startPos++;
                ret.add(1);
            } else {
                endPos = tempIndex.get(1);
                int startPosCopy = startPos, endPosCopy = endPos;
                while (true) {
                    int maxOtherCharIndex = -1;
                    for (int i = startPosCopy + 1; i <= endPosCopy - 1; i++) {
                        if (charIndex.get(S.charAt(i)).size() == 2) {
                            maxOtherCharIndex = Math.max(maxOtherCharIndex, charIndex.get(S.charAt(i)).get(1));
                        }
                    }
                    if (maxOtherCharIndex > endPosCopy) {
                        startPosCopy = endPos;
                        endPosCopy = maxOtherCharIndex;
                    } else {
                        ret.add(endPosCopy - startPos + 1);
                        startPos = endPosCopy + 1;
                        break;
                    }
                }
            }
        }

        return ret;
    }
}