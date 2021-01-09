// import java.util.*;

// 求一个元素唯一的数组的全排列集合
/**
 * Runtime: 2 ms, faster than 46.64% of Java online submissions for Permutations.
 * Memory Usage: 41.3 MB, less than 5.52% of Java online submissions for Permutations.
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<>(), permutations);

        return permutations;
    }

    private void collectPermutations(int[] nums, int start, List<Integer> permutation, List<List<Integer>> permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        // 遍历不同位置插入
        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }

    // public static void main(String[] args) {
    //     int[] nums = {1, 2, 3};
    //     Solution s1 = new Solution();
    //     List<List<Integer>> permutations = s1.permute(nums);
    //     for (List<Integer> permutation: permutations) {
    //         for (Integer i: permutation) {
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }
}