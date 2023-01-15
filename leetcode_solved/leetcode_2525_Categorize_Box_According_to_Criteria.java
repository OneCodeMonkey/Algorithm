// AC: Runtime 0 ms Beats 100% 
// Memory 39.3 MB Beats 81.90%
// .
// T:O(1), S:O(1)
// 
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int maxEdge = 10_000, maxVol = 1_000_000_000, maxMass = 100;
        if (length >= maxEdge || width >= maxEdge || height >= maxEdge || (long) length * width * height >= maxVol) {
            if (mass >= maxMass) {
                return "Both";
            } else {
                return "Bulky";
            }
        } else if (mass >= maxMass) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
