// AC: Runtime: 20 ms, faster than 75.00% of Java online submissions for Find the Kth Largest Integer in the Array.
// Memory Usage: 47.5 MB, less than 50.00% of Java online submissions for Find the Kth Largest Integer in the Array.
// treemap
// T:O(nlogn), S:O(n)
//
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        TreeMap<Integer, List<String>> record = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (String str: nums) {
            int len = str.length();
            if (record.containsKey(len)) {
                record.get(len).add(str);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                record.put(len, tempList);
            }
        }

        int count = 0;
        for (int len: record.keySet()) {
            int lenCount = record.get(len).size();
            if (count + lenCount >= k) {
                // return list
                record.get(len).sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                });
                return record.get(len).get(k - count - 1);
            } else {
                count += lenCount;
            }
        }

        return nums[0];
    }
}