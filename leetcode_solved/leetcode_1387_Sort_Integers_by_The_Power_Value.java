// AC: Runtime: 56 ms, faster than 55.70% of Java online submissions for Sort Integers by The Power Value.
// Memory Usage: 37.9 MB, less than 95.07% of Java online submissions for Sort Integers by The Power Value.
// using treemap
// T:O(n), S:O(n)
// 
class Solution {
    public int getKth(int lo, int hi, int k) {
        TreeMap<Integer, List<Integer>> record = new TreeMap<>();
        for (int i = lo; i <= hi; i++) {
            int value = solve(i);
            if (record.get(value) != null) {
                record.get(value).add(i);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                record.put(value, temp);
            }
        }

        int tempCount = 0;
        for (int i: record.keySet()) {
            int numbers = record.get(i).size();
            if (tempCount + numbers < k) {
                tempCount += numbers;
            } else if (tempCount + numbers == k) {
                return record.get(i).get(numbers - 1);
            } else {
                return record.get(i).get(k - tempCount - 1);
            }
        }

        return -1;
    }

    private int solve(int num) {
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            count++;
        }

        return count;
    }
}