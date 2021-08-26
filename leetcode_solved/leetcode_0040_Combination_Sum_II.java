// AC: Runtime: 16 ms, faster than 15.85% of Java online submissions for Combination Sum II.
// Memory Usage: 39.6 MB, less than 27.94% of Java online submissions for Combination Sum II.
// using hashset & hashmap.
// T:O(n^2) ~ O(n^3), S:O(n^2)
// 
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> ret = new HashSet<>();
        HashMap<Integer, HashSet<List<Integer>>> record = new LinkedHashMap<>();
        HashSet<List<Integer>> emptyList = new HashSet<>();
        emptyList.add(new LinkedList<>());
        record.put(0, emptyList);

        for (int candidate : candidates) {
            if (record.containsKey(target - candidate)) {
                for (List<Integer> list : record.get(target - candidate)) {
                    List<Integer> copy = new LinkedList<>(list);
                    copy.add(candidate);
                    Collections.sort(copy);
                    ret.add(copy);
                }
            }

            HashMap<Integer, HashSet<List<Integer>>> record2 = new LinkedHashMap<>();
            for (int sum : record.keySet()) {
                int newSum = sum + candidate;
                if (newSum >= target) {
                    continue;
                }

                HashSet<List<Integer>> tempCombinations = new HashSet<>();
                for (List<Integer> item : record.get(sum)) {
                    List<Integer> tempList = new LinkedList<>(item);
                    tempList.add(candidate);
                    tempCombinations.add(tempList);
                }

                if (record2.containsKey(newSum)) {
                    record2.get(newSum).addAll(tempCombinations);
                } else {
                    record2.put(newSum, tempCombinations);
                }
            }

            for (int newSum : record2.keySet()) {
                if (record.containsKey(newSum)) {
                    record.get(newSum).addAll(record2.get(newSum));
                } else {
                    record.put(newSum, record2.get(newSum));
                }
            }
        }

        return new LinkedList<>(ret);
    }
}