// AC: Runtime 3 ms Beats 100%
// Memory: 41.9 MB Beats 100%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character, Integer> record = new HashMap<>();
        for (char c : word.toCharArray()) {
            record.merge(c, 1, Integer::sum);
        }
        List<Integer> frequency = new ArrayList<>();
        for (char c : record.keySet()) {
            frequency.add(record.get(c));
        }
        if (frequency.size() < 2) {
            return true;
        }
        Collections.sort(frequency);
        boolean flag1 = true, flag2 = true;
        for (int i = 1; i < frequency.size() - 1; i++) {
            if (!frequency.get(i).equals(frequency.get(i - 1))) {
                flag1 = false;
                break;
            }
        }
        for (int i = frequency.size() - 1; i >= 2; i--) {
            if (!frequency.get(i).equals(frequency.get(i - 1))) {
                flag2 = false;
                break;
            }
        }
        if (!flag1 && !flag2) {
            return false;
        }
        if (frequency.get(frequency.size() - 1) - frequency.get(0) > 1) {
            return false;
        }
        if (frequency.get(frequency.size() - 1).equals(frequency.get(0)) &&
                frequency.get(frequency.size() - 1) != 1) {
            return false;
        }

        return true;
    }
}