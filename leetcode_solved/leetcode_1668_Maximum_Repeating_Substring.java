// AC: Runtime: 1 ms, faster than 69.78% of Java online submissions for Maximum Repeating Substring.
// Memory Usage: 37.5 MB, less than 25.29% of Java online submissions for Maximum Repeating Substring.
// .
// T:O(len(sequence)*(len(sequence) / len(word))), S:O(1)
// 
class Solution {
    public int maxRepeating(String sequence, String word) {
        int wordLen = word.length(), ret = 0, temp = 0;
        while (sequence.contains(word)) {
            int index = sequence.indexOf(word);
            if (index == -1) {
                break;
            }
            int seqLen = sequence.length();
            temp++;
            ret = Math.max(ret, temp);
            // search for longest repeated substring
            boolean reachEnd = false;
            while (index + (temp + 1) * wordLen <= seqLen && sequence.substring(index + temp * wordLen, index + (temp + 1) * wordLen).equals(word)) {
                temp++;
                ret = Math.max(ret, temp);
                if (index + (temp + 1) * wordLen == seqLen) {
                    reachEnd = true;
                }
            }
            if (reachEnd) {
                break;
            }

            // move forward by the next occurence of word
            index = sequence.indexOf(word, 1);
            if (index != -1)  {
                sequence = sequence.substring(index);
                temp = 0;
            } else {
                break;
            }
        }

        return ret;
    }
}