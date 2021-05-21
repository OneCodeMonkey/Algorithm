// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
// Memory Usage: 35.2 MB, less than 97.20% of Java online submissions for Guess Number Higher or Lower.
// binary search
// T:O(logn), S:O(1)
// 
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}