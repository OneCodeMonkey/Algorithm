// AC: Runtime: 26 ms, faster than 78.27% of Java online submissions for Contains Duplicate III.
// Memory Usage: 51.5 MB, less than 25.98% of Java online submissions for Contains Duplicate III.
// using bucket to check diff, and retain k-bucket
// T:O(n), S:O(k)
//
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Long, Long> record = new HashMap<>();
        if (k <= 0 && t < 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            long longValue = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = longValue / ((long) t + 1);
            if (record.containsKey(bucket) || (record.containsKey(bucket + 1) && record.get(bucket + 1) - longValue <= t) ||
                    (record.containsKey(bucket - 1) && longValue - record.get(bucket - 1) <= t)) {
                return true;
            }
            if (record.size() >= k) {
                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
                record.remove(lastBucket);
            }
            record.put(bucket, longValue);
        }

        return false;
    }
}