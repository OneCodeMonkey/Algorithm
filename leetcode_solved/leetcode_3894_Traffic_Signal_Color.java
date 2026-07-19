// Runtime 1 ms Beats 70.43% 
// Memory 43.51 MB Beats 39.84%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String trafficSignal(int timer) {
        String ret = "Invalid";
        if (timer == 0) {
            ret = "Green";
        } else if (timer == 30) {
            ret = "Orange";
        } else if (timer > 30 && timer <= 90) {
            ret = "Red";
        }

        return ret;
    }
}
