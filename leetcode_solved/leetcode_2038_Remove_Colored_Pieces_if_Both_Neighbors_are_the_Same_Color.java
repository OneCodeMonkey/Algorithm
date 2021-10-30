// AC: Runtime: 12 ms, faster than 79.17% of Java online submissions for Remove Colored Pieces if Both Neighbors are the Same Color.
// Memory Usage: 51.9 MB, less than 32.64% of Java online submissions for Remove Colored Pieces if Both Neighbors are the Same Color.
// counting continues A substring which length >= 3, then plus (length - 2), that is A player can move maximum,
//  Thus B. return canMoveA > canMoveB.
// T:O(n), S:O(1)
//
class Solution {
    public boolean winnerOfGame(String colors) {
        int canMoveA = 0, canMoveB = 0, continuesA = 0, continuesB = 0;
        for (int i = 0; i < colors.length(); i++) {
            char c = colors.charAt(i);
            if (c == 'A') {
                if (continuesA != 0) {
                    continuesA++;
                    if (continuesA >= 3) {
                        canMoveA++;
                    }
                } else {
                    continuesA++;
                    continuesB = 0;
                }
            } else {
                if (continuesB != 0) {
                    continuesB++;
                    if (continuesB >= 3) {
                        canMoveB++;
                    }
                } else {
                    continuesB++;
                    continuesA = 0;
                }
            }
        }

        return canMoveA > canMoveB;
    }
}