// AC: Runtime: 156 ms, faster than 51.85% of Java online submissions for Simple Bank System.
// Memory Usage: 155.8 MB, less than 16.44% of Java online submissions for Simple Bank System.
// Just do as the problem says.
//  T:O(1), S:O(n)
//
class Bank {
    private final long[] record;
    private final int size;

    public Bank(long[] balance) {
        size = balance.length;
        record = new long[balance.length];
        System.arraycopy(balance, 0, record, 0, balance.length);
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 < 1 || account1 > size || account2 < 1 || account2 > size || record[account1 - 1] < money) {
            return false;
        }
        record[account1 - 1] -= money;
        record[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account < 1 || account > size) {
            return false;
        }
        record[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account < 1 || account > size || record[account - 1] < money) {
            return false;
        }
        record[account - 1] -= money;

        return true;
    }
}