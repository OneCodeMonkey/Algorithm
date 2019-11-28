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
private:
	int sum = 0;
public:
	void travel(TreeNode* root) {
		if(!root)
			return;
		if(root->right)
			travel(root->right);
		root->val = (sum += root->val);
		if(root->left)
			travel(root->left);
	}
    TreeNode* convertBST(TreeNode* root) {
        travel(root);
        return root;
    }
};