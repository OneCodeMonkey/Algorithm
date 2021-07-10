// AC: Runtime: 2 ms, faster than 91.18% of Java online submissions for Letter Tile Possibilities.
// Memory Usage: 36.6 MB, less than 99.51% of Java online submissions for Letter Tile Possibilities.
// DP
// T:O(n), S:O(1)
// 
class Solution {
    public int numTilePossibilities(String tiles) {
        int[] record = new int[26];
        for (char c: tiles.toCharArray()) {
            record[c - 'A']++;
        }
        
        return dfs(record);
    }

    public int dfs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                continue;
            }
            sum++;
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }

        return sum;
    }
}