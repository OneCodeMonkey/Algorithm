/**
 * 思路：二叉搜索树删减元素，使剩余的元素都能落在给定的区间以内
 * 递归判断 root 的值与 [L, R] 的关系。
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
    TreeNode* trimBST(TreeNode* root, int L, int R) {
        if(root == NULL)
        	return root;
        if(root->val < L)	// 只可能在右子树
        	return trimBST(root->right, L, R);
        if(root->val > R)	// 只可能在左子树
        	return trimBST(root->left, L, R);
        root->left = trimBST(root->left, L, R);		// 递归向下判断
        root->right = trimBST(root->right, L, R);

        return root;
    }
};
