// AC: Runtime 11 ms Beats 100%
// Memory: 43.5 MB Beats 100%
// Sort.
// T:O(n), S:O(n)
// 
class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, List<Integer>> maxDigitNumbers = new HashMap<>();
        for (int num : nums) {
            int maxDigit = maxDigit(num);
            if (maxDigitNumbers.containsKey(maxDigit)) {
                maxDigitNumbers.get(maxDigit).add(num);
            } else {
                List<Integer> tempList = new LinkedList<>();
                tempList.add(num);
                maxDigitNumbers.put(maxDigit, tempList);
            }
        }

        int ret = -1;
        for (int digit : maxDigitNumbers.keySet()) {
            if (maxDigitNumbers.get(digit).size() < 2) {
                continue;
            }
            List<Integer> tempList = maxDigitNumbers.get(digit);
            Collections.sort(tempList);
            ret = Math.max(ret, tempList.get(tempList.size() - 1) + tempList.get(tempList.size() - 2));
        }

        return ret;
    }

    private int maxDigit(int n) {
        int digit = 0;
        while (n > 0) {
            digit = Math.max(digit, n % 10);
            n /= 10;
        }

        return digit;
    }
}
