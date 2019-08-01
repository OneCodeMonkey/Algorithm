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
	/**
	 * AC:
	 * Runtime: 16 ms, faster than 87.49% of C++ online submissions for Unique Binary Search Trees II.
	 * Memory Usage: 16.5 MB, less than 78.19% of C++ online submissions for Unique Binary Search Trees II.
	 *
	 */
	vector<TreeNode*> generateTrees(int s, int t) {
		vector<TreeNode*> ans;
		if(s > t) {
			ans.push_back(NULL);
			return ans; 
		}
		if(s == t) {
			TreeNode* node1 = new TreeNode(s);
			ans.push_back(node1);
			return ans;
		}
		for(int i = s; i <= t; i++) {
			vector<TreeNode*> l = generateTrees(s, i - 1);
			vector<TreeNode*> r = generateTrees(i + 1, t);
			for(auto it1:l) {
				for(auto it2:r) {
					TreeNode* node2 = new TreeNode(i);
					node2->left = it1;
					node2->right = it2;
					ans.push_back(node2);
				}
			}
		}

		return ans;
	}
    vector<TreeNode*> generateTrees(int n) {
     	vector<TreeNode*> ans;
     	if(n == 0) {
     		return ans;   
     	}

     	return generateTrees(1, n);
    }
};
