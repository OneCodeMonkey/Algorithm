// Runtime 3 ms Beats 62.16%
// Memory 42.87 MB Beats 64.36%
// brute-force.
// T:O(n^2), S:O(n)
//
class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i : nums) a.add(i);
        int ans = 0;
        while (a.size() >= 2 && !f(a)) {
            ans++;
            int l1 = -1;
            int l2 = -1;
            int max = Integer.MAX_VALUE;
            for (int i = 1; i < a.size(); i++) {
                int s = a.get(i) + a.get(i - 1);
                if (s < max) {
                    l1 = i;
                    l2 = i - 1;
                    max = s;
                }

            }

            a.remove(l1);
            a.add(l1, max);
            a.remove(l2);
        }
        return ans;
    }

    public boolean f(ArrayList<Integer> a) {
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) < a.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
