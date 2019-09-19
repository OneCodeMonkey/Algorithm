class Solution {
public:
    string addBinary(string a, string b) {
        int flag = 1;
        vector<char> ans, avec, bvec;
        for(int i = 0; i < a.length(); i++)
        	avec.push_back(a[i]);
        for(int i = 0; i < b.length(); i++)
        	avec.push_back(b[i]);

        int range = avec.size() < bvec.size() ? avec.size() : bvec.size();

        for(int i = range - 1; i >= 0; i--) {
        	// if()
        }
    }
};