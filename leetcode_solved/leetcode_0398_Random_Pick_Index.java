// AC: Runtime: 64 ms, faster than 61.75% of Java online submissions for Random Pick Index.
// Memory Usage: 49.2 MB, less than 39.72% of Java online submissions for Random Pick Index.
// hashmap
// T:O(maxDup), S:O(n),  maxDup 是重复次数最多的数字的次数
// 
class Solution {
    private HashMap<Integer, List<Integer>> record;

    public Solution(int[] nums) {
        record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.get(nums[i]) != null) {
                record.get(nums[i]).add(i);
            } else {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(i);
                record.put(nums[i], tempList);
            }
        }
    }

    public int pick(int target) {
        List<Integer> list = record.get(target);
        Random rand = new Random();
        int randIndex = rand.nextInt(list.size());
        return list.get(randIndex);
    }
}