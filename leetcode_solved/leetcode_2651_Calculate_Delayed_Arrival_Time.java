// AC: Runtime 0 ms Beats 100% 
// Memory 39.1 MB Beats 100%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
