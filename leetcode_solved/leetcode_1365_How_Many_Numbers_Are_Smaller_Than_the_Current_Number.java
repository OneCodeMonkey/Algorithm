// AC:
// Runtime: 5 ms, faster than 61.03% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// Memory Usage: 38.7 MB, less than 94.55% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// 思路：用hashmap存比某个值小的个数，这样避免 O(n^2) 复杂度
// 复杂度：T：O(nlogn), S:O(n)
// 
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer, Integer> times = new HashMap<>();
        // 存比 i 小的数的个数
        HashMap<Integer, Integer> addTimes = new HashMap<>();
        int max = nums[0], size = nums.length;
        for (int i = 0; i < size; i++) {
            times.merge(nums[i], 1, Integer::sum);
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int tempSum = 0, tempInt;
        List<Integer> keySet = new ArrayList<>(times.keySet());
        Collections.sort(keySet);
        for (Integer i : keySet) {
            tempInt = times.get(i);
            tempSum += tempInt;
            addTimes.put(i, tempSum - tempInt);
        }
        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            ret[i] = addTimes.get(nums[i]);
        }
        return ret;
    }
}