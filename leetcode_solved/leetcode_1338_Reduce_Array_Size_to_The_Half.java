// AC: Runtime: 39 ms, faster than 48.20% of Java online submissions for Reduce Array Size to The Half.
// Memory Usage: 51.6 MB, less than 52.52% of Java online submissions for Reduce Array Size to The Half.
// using treemap to sort
// T:O(n), S:O(n)
//
class Solution {
    public int minSetSize(int[] arr) {
        int size = arr.length;
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int i: arr) {
            record.merge(i, 1, Integer::sum);
        }
        TreeMap<Integer, List<Integer>> timesSort = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i: record.keySet()) {
            int times = record.get(i);
            if (timesSort.get(times) != null) {
                timesSort.get(times).add(i);
            } else {
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                timesSort.put(times, temp);
            }
        }

        int temp = 0, ret = 0;
        for (int i: timesSort.keySet()) {
            int numbers = timesSort.get(i).size();

            if ((size / 2 - temp) / i >= numbers) {
                if ((size / 2 - temp) / i == numbers && (size / 2 - temp) % i == 0) {
                    ret += numbers;
                    break;
                } else {
                    temp += i * numbers;
                    ret += numbers;
                }
            } else {
                ret += Math.ceil((size / (2 * 1.0) - temp) / i);
                break;
            }
        }

        return ret;
    }
}