// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Minimum Number of Moves to Seat Everyone.
// Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Minimum Number of Moves to Seat Everyone.
// sort and sum diff of abs(seats[i] - students[i])
// T:O(nlogn), S:O(logn)
//
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ret = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            ret += Math.abs(students[i] - seats[i]);
        }

        return ret;
    }
}