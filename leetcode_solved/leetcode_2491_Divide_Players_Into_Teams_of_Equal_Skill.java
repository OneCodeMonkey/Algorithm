// Time: Runtime 38 ms Beats 71.43% 
// Memory 73 MB Beats 14.29%
// greedy.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public long dividePlayers(int[] skill) {
        int sum = 0, len = skill.length;
        for (int i : skill) {
            sum += i;
        }
        if ((sum % (len / 2)) != 0) {
            return -1;
        }
        long ret = 0;
        Arrays.sort(skill);
        for (int i = 0; i < len / 2; i++) {
            if (skill[i] + skill[len - 1 - i] != sum * 2 / len) {
                return -1;
            }
            ret += (long) skill[i] * skill[len - 1 - i];
        }

        return ret;
    }
}
