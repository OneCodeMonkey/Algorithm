// AC: Runtime 20 ms Beats 20% 
// Memory 43.6 MB Beats 20%
// HashSet.
// T:O(n^2), S:O(n)
//
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> recordA = new HashSet<>(), recordB = new HashSet<>();
        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            recordA.add(A[i]);
            recordB.add(B[i]);
            int countSame = 0;
            for (int key : recordB) {
                if (recordA.contains(key)) {
                    countSame++;
                }
            }
            ret[i] = countSame;
        }

        return ret;
    }
}
