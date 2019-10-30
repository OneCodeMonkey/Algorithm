class Solution {
public:
    bool isPerfectSquare(int num) {
        return fmod(sqrt(num), 1) == 0;
    }
};