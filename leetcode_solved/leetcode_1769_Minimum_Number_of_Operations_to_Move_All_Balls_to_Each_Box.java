// Solution1:
// AC: Runtime: 543 ms, faster than 5.05% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
// Memory Usage: 48.2 MB, less than 5.99% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
// .
// T:O(n^2), S:O(n)
// 
class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length(), tempCount = 0;
        int[] ret = new int[size];
        HashSet<Integer> onePos = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (boxes.charAt(i) == '1') {
                onePos.add(i);
            }
        }
        for (int i = 0; i < size; i++) {
            tempCount = 0;
            for (int j: onePos) {
                tempCount += Math.abs(j - i);
            }
            ret[i] = tempCount;
        }
        
        return ret;
    }
}

// Solution2
// AC: Runtime: 3 ms, faster than 77.20% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
// Memory Usage: 44.9 MB, less than 7.59% of Java online submissions for Minimum Number of Operations to Move All Balls to Each Box.
// record the count of one-bit on the left of i-th element.
// T:O(n), S:O(n)
//
class Solution {
    public int[] minOperations(String boxes) {
        int size = boxes.length(), leftOneCountTemp = 0, totalOneCount = 0, tempSum = 0;
        int[] ret = new int[size];
        if (size == 1) {
            return ret;
        }
        int[] leftOneCount = new int[size];
        leftOneCount[0] = 0;
        for (int i = 0; i < size - 1; i++) {
            if (boxes.charAt(i) == '1') {
                totalOneCount++;
                tempSum += i;
                leftOneCountTemp++;
            }
            leftOneCount[i + 1] = leftOneCountTemp;
        }
        if (boxes.charAt(size - 1) == '1') {
            totalOneCount++;
            tempSum += size - 1;
        }

        ret[0] = tempSum;
        for (int i = 1; i < size; i++) {
            tempSum += leftOneCount[i];
            tempSum -= totalOneCount - leftOneCount[i];
            ret[i] = tempSum;
        }

        return ret;
    }
}