// Runtime 254 ms Beats 74.64% 
// Memory 168.02 MB Beats 11.38%
// Map. 注意：如果在遍历中直接判断 freq > 1 就直接 add 到结果集 list 中，因为很可能有的数有三种 a^3+b^3 的组合，而 list 不会去重。
//          此时注意去重
// T:O(n^(2/3)), S:O(n^(2/3))
// 
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> ret = new ArrayList<>();
        int MAX_VAL = Math.min(1000, (int) Math.pow(n, 1.0 / 3.0));
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i = 1; i <= MAX_VAL; i++) {
            for (int j = i; j <= MAX_VAL; j++) {
                long sum = (long) i * i * i + (long) j * j * j;
                if (sum > n) {
                    break;
                }
                record.merge((int) sum, 1, Integer::sum);
            }
        }
        for (int i : record.keySet()) {
            if (record.get(i) > 1) {
                ret.add(i);
            }
        }
        Collections.sort(ret);

        return ret;
    }
}

// Solution2
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashSet<Integer> ret = new HashSet<>();
        int MAX_VAL = Math.min(1000, (int) Math.pow(n, 1.0 / 3.0));
        HashMap<Long, Integer> record = new HashMap<>();
        for (int i = 1; i <= MAX_VAL; i++) {
            for (int j = i; j <= MAX_VAL; j++) {
                long sum = (long) i * i * i + (long) j * j * j;
                if (sum > n) {
                    break;
                }
                if (record.containsKey(sum)) {
                    ret.add((int) sum);
                }
                record.merge(sum, 1, Integer::sum);
            }
        }
        List<Integer> ret2 = new ArrayList<>(ret);
        Collections.sort(ret2);

        return ret2;
    }
}
