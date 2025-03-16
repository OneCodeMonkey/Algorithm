// Runtime 5 ms Beats 100.00% 
// Memory 42.96 MB Beats 100.00%
// Brute-force.
// T:O(10^3), S:O(1)
// 
class Solution {
    public int totalNumbers(int[] digits) {
        int ret = 0;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int digit : digits) {
            record.merge(digit, 1, Integer::sum);
        }
//        System.out.println(record);
        for (int key : record.keySet()) {
            if (key % 2 == 0) {
                for (int key1 : record.keySet()) {
                    if (key1 != 0) {
                        if (record.get(key) > 1 || key1 != key) {
                            for (int key2 : record.keySet()) {
                                if ((record.get(key) > 2 && key1 == key && key2 == key) ||
                                        (record.get(key) > 1 && key1 != key && key2 == key) ||
                                        (record.get(key1) > 1 && key1 != key && key2 == key1) ||
                                        (key2 != key1 && key2 != key)) {
                                    ret++;
//                                    System.out.println(key + " - " + key1 + " - " + key2);
                                }
                            }
                        }
                    }
                }
            }
        }

        return ret;
    }
}
