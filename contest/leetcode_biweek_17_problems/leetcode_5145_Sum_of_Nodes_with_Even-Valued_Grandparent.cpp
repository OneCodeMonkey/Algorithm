/**
 * AC:
 * 思路：递归，定义 f(node), 对于每一个 node，判断到孙子节点，如果当前 node->val 为偶，
 *    则加进其孙子节点的值（如果存在）,然后 再递归累加 ret += f(node->left) + f(node->right)
 * T:O(n), n 为二叉树的节点数
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
    int sumEvenGrandparent(TreeNode* root) {
        TreeNode* tmp = root;
        int ret = 0;
        if(root->val % 2 == 0) {	// 偶数点
        	if(root->left) {
        		if(root->left->left)
        			ret += root->left->left->val;
        		if(root->left->right)
        			ret += root->left->right->val;
        		ret += sumEvenGrandparent(root->left);		// 递归
        	}
        	if(root->right) {
        		if(root->right->left)
        			ret += root->right->left->val;
        		if(root->right->right)
        			ret += root->right->right->val;
        		ret += sumEvenGrandparent(root->right);
        	}
        } else {
        	if(root->left) {
        		ret += sumEvenGrandparent(root->left);		// 递归
        	}
        	if(root->right) {
        		ret += sumEvenGrandparent(root->right);
        	}
        }

        return ret;
    }
};