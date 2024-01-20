// Runtime 64 ms Beats 45.28% of users with Java
// Memory 45.91 MB Beats 6.99% of users with Java
// Since the character convertion operation is not limited times, we just need to check unique chars set are equal, \
// and frequency list after sorted are same.
// T:O(n), S:O(1)
// 
class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> record1 = new HashMap<>(), record2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            record1.merge(c, 1, Integer::sum);
        }
        for (char c : word2.toCharArray()) {
            record2.merge(c, 1, Integer::sum);
        }
        if (!record1.keySet().equals(record2.keySet())) {
            return false;
        }
        List<Integer> times1 = new ArrayList<>(), times2 = new ArrayList<>();
        for (char c : record1.keySet()) {
            times1.add(record1.get(c));
        }
        for (char c : record2.keySet()) {
            times2.add(record2.get(c));
        }
        Collections.sort(times1);
        Collections.sort(times2);

        return times1.equals(times2);
    }
}
