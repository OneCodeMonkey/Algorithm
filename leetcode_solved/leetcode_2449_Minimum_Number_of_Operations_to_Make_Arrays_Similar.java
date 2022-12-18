// AC: Runtime 138 ms Beats 43.1% 
// Memory 63.5 MB Beats 83.36%
// sort with odd and even, count every odd that nums[i] > target[i], add diff / 2.
// T:O(nlogn), S:O(n)
// 
class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        long ret = 0;
        List<Integer> oddA = new ArrayList<>(), evenA = new ArrayList<>(), oddB = new ArrayList<>(), evenB = new ArrayList<>();
        for (int i : nums) {
            if (i % 2 == 1) {
                oddA.add(i);
            } else {
                evenA.add(i);
            }
        }
        for (int i : target) {
            if (i % 2 == 1) {
                oddB.add(i);
            } else {
                evenB.add(i);
            }
        }
        Collections.sort(oddA);
        Collections.sort(oddB);
        Collections.sort(evenA);
        Collections.sort(evenB);
        for (int i = 0; i < oddA.size(); i++) {
            if (oddA.get(i) > oddB.get(i)) {
                ret += (oddA.get(i) - oddB.get(i)) / 2;
            }
        }
        for (int i = 0; i < evenA.size(); i++) {
            if (evenA.get(i) > evenB.get(i)) {
                ret += (evenA.get(i) - evenB.get(i)) / 2;
            }
        }

        return ret;
    }
}
