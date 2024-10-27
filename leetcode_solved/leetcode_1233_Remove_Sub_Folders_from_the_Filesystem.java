// Solution 1: Sort and see regular.
// Runtime 42 ms Beats 75.31%
// Memory 55.70 MB Beats 46.94%
// If sorted, the sequence like "/a", "/a/b", "/aa" can be compared straightly, we check the last one is start with the former one + '/'.
// T:O(n), S:O(n)
// 
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ret = new ArrayList<>();
        Arrays.sort(folder);
        String prev = "";
        for (String s : folder) {
            if (ret.isEmpty() || !s.startsWith(prev + '/')) {
                ret.add(s);
                prev = s;
            }
        }

        return ret;
    }
}


// Solution 2: Trie tree solution.
// todo-understand: https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/solutions/409626/java-trie-solution/?envType=daily-question&envId=2024-10-25
