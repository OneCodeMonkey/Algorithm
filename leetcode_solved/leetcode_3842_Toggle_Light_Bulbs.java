// Runtime 7 ms Beats 46.35% 
// Memory 47.07 MB Beats 25.08%
// .
// T:O(n) ~O(1), S:O(n)~O(1)
// 
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> ret = new ArrayList<>();
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int bulb : bulbs) {
            record.merge(bulb, 1, Integer::sum);
        }
        for (int i : record.keySet()) {
            if (record.get(i) % 2 == 1) {
                ret.add(i);
            }
        }

        Collections.sort(ret);
        return ret;
    }
}
