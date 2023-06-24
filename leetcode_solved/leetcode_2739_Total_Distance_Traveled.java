// AC: Runtime 8 ms Beats 54.99% 
// Memory 42.6 MB Beats 93.10%
// .
// T:O(logn), S:O(1)
// 
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ret = 0, fuelOneTime = 0, extraAdd = 0;
        while (mainTank > 0) {
            fuelOneTime = mainTank / 5 * 5;
            ret += fuelOneTime;
            if (mainTank / 5 <= additionalTank) {
                extraAdd = mainTank / 5;
                additionalTank -= extraAdd;
            } else {
                extraAdd = additionalTank;
                additionalTank = 0;
            }
            mainTank -= fuelOneTime;
            if (extraAdd == 0) {
                break;
            }
            mainTank += extraAdd;
        }
        ret += mainTank;

        return ret * 10;
    }
}
