/**
 * AC:
 * Runtime: 0 ms, faster than 100.00% of C++ online submissions for Invert Binary Tree.
 * Memory Usage: 9.2 MB, less than 81.82% of C++ online submissions for Invert Binary Tree.
 *
 * 思路：递归,对每一级进行反转
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
     	if(root) {
     		invertTree(root->left);
     		invertTree(root->right);
     		std::swap(root->left, root->right);
     	}
     	return root;
    }
};