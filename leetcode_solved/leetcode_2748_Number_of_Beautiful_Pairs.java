// AC: Runtime 25 ms Beats 75% 
// Memory 44.7 MB Beats 25%
// Hashmap.
// T:O(n), S:O(1)
// 
class Solution {
    public int countBeautifulPairs(int[] nums) {
        List<HashSet<Integer>> coprimes = new ArrayList<>();
        coprimes.add(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 3, 5, 7, 9)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 2, 4, 5, 7, 8)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 3, 5, 7, 9)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 5, 7)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 3, 5, 7, 9)));
        coprimes.add(new HashSet<>(Arrays.asList(1, 2, 4, 5, 7, 8)));

        HashMap<Integer, Integer> beforeFirstDigitCount = new HashMap<>();
        int ret = 0;
        for (int num : nums) {
            int lastDigit = num % 10, firstDigit = 0, singleCount = 0;
            while (num >= 10) {
                num /= 10;
            }
            firstDigit = num;
            HashSet<Integer> primes = coprimes.get(lastDigit - 1);
            for (int prime : primes) {
                singleCount += beforeFirstDigitCount.getOrDefault(prime, 0);
            }
            ret += singleCount;
            beforeFirstDigitCount.merge(firstDigit, 1, Integer::sum);
        }

        return ret;
    }
}
