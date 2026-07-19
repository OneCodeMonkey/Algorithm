// Runtime 45 ms Beats 31.66% 
// Memory 47.15 MB Beats 12.86%
// .
// T:O(nlogn), S:O(n)
// 
class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<int> A(arr);
        sort(A.begin(), A.end());
        unordered_map<int, int> rank;
        
        for (int& a:A) {
        	rank.emplace(a, rank.size() + 1);
        }

        for (int& a:arr) {
        	a = rank[a];
        }

        return arr;
    }
};