// AC: 模拟
// Runtime: 198 ms, faster than 33.33% of Java online submissions for Find the Winner of the Circular Game.
// Memory Usage: 38.3 MB, less than 33.33% of Java online submissions for Find the Winner of the Circular Game.
class Solution {
    public int findTheWinner(int n, int k) {
        if (n == 1 || k == 1) {
            return n;
        }

        int[] record = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            record[i] = 0;
        }
        Stack<Integer> losed = new Stack<>();
        int pos = 1;
        boolean startFirstLoop = false;
        while(losed.size() < n) {
            int tempK = k;
            if (!startFirstLoop) {
                tempK--;
                pos = (pos + 1) % (n + 1);
                startFirstLoop = true;
            }
            while (true) {
                if (pos != 0 && record[pos] != 1) {
                    if (tempK > 0) {
                        tempK--;
                    }
                    if (tempK == 0) {
                        break;
                    }
                }
                pos = (pos + 1) % (n + 1);
            }
            record[pos] = 1;
            losed.add(pos);
        }
        return losed.peek();
    }
}