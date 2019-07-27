/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

/**
 * AC:
 * Runtime: 12 ms, faster than 93.31% of C++ online submissions for Lowest Common Ancestor of Deepest Leaves.
 * Memory Usage: 19.6 MB, less than 100.00% of C++ online submissions for Lowest Common Ancestor of Deepest Leaves.
 * 
 */
class Solution {
	int retd;
	TreeNode* ret;
	int getDepth(TreeNode* root, int h) {
		if(!root->left && !root->right) {
			if(h > retd) {
				retd = h;
				ret = root;
			}
			return h;
		}
		int ll = 0;
		int rr = 0;
		if(root->left)
			ll = getDepth(root->left, h + 1);
		if(root->right)
			rr = getDepth(root->right, h + 1);
		if(ll == rr && ll == retd)
			ret = root;

		return max(ll, rr);
	}
public:
    TreeNode* lcaDeepestLeaves(TreeNode* root) {
        retd = -1;
        ret = NULL;
        if(root)
        	getDepth(root, 0);

        return ret;
    }
};
