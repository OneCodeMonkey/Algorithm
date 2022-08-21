// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Hours of Training to Win a Competition.
// Memory Usage: 43.1 MB, less than 14.29% of Java online submissions for Minimum Hours of Training to Win a Competition.
// thought: whatever you need to make initialEnergy greater then sum of energy, and find the max diff while getting experience, 
// that is the experience you need to add before start.
// T:O(m + n), S:O(1)
// 
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ret = 0, sumEnergy = 0;
        for (int i : energy) {
            sumEnergy += i;
        }
        ret += sumEnergy >= initialEnergy ? (sumEnergy - initialEnergy + 1) : 0;
        int minDiff = 0;
        for (int i : experience) {
            if (initialExperience <= i) {
                minDiff = Math.min(minDiff, initialExperience - i - 1);
            }
            initialExperience += i;
        }
        ret += -minDiff;

        return ret;
    }
}