// Runtime 8 ms Beats 10.21% 
// Memory 43.22 MB Beats 22.77%
// .
// T:O(logn), S:O(logn)
// 
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ret = new ArrayList<>();
        int exp = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit > 0) {
                ret.add(digit * exp);
            }
            n /= 10;
            exp *= 10;
        }

        return ret.stream().sorted((o1, o2) -> o2 - o1).mapToInt(Integer::intValue).toArray();
    }
}
