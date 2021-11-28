class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int size = tickets.length, ret = 0;

        while (tickets[k] > 0) {
            for (int i = 0; i < size; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    ret++;
                    if (tickets[k] == 0) {
                        return ret;
                    }
                }
            }
        }

        return ret;
    }
}