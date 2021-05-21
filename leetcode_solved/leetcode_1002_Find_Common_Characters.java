// AC: Runtime: 12 ms, faster than 27.67% of Java online submissions for Find Common Characters.
// Memory Usage: 38.7 MB, less than 97.88% of Java online submissions for Find Common Characters.
// 遍历
// T:O(A.length * len(A[i]) ^ 2), S:O(A[i].length)
// 
class Solution {
    public List<String> commonChars(String[] A) {
        int minLen = A[0].length(), minLenIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i].length() < minLen) {
                minLen = A[i].length();
                minLenIndex = i;
            }
        }

        List<String> ret = new LinkedList<>();
        HashSet<Character> record = new HashSet<>();
        for (int i = 0; i < A[minLenIndex].length(); i++) {
            char temp = A[minLenIndex].charAt(i);
            if (record.contains(temp)) {
                continue;
            }
            int minOccurTime = 9999;
            for (int j = 0; j < A.length; j++) {
                int tempCount = 0;
                for (int k = 0; k < A[j].length(); k++) {
                    if (A[j].charAt(k) == temp) {
                        tempCount++;
                    }
                }
                if (tempCount < minOccurTime) {
                    minOccurTime = tempCount;
                }
            }
            if (minOccurTime > 0) {
                for (int t = 0; t < minOccurTime; t++) {
                    ret.add(String.valueOf(temp));
                }
            }
            record.add(temp);
        }
        
        return ret;
    }
}