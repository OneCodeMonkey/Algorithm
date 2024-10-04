// Runtime 5 ms Beats 100.00%
// Memory 44.12 MB Beats 100.00%
// .
// T:O(k), S:O(k)
// 
class Solution {
    public char kthCharacter(int k) {
        List<Integer> sequence = new ArrayList<>(), tmp = new ArrayList<>();
        sequence.add(0);
        for (int i = 0; i < k; i++) {
            for (int num : sequence) {
                tmp.add((num + 1) % 26);
            }
            sequence.addAll(tmp);
            if (sequence.size() >= k) {
                break;
            }
            tmp.clear();
        }
        char ret = (char) (sequence.get(k - 1) + 'a');

        return ret;
    }
}
