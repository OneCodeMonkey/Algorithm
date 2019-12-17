/**
 * 思路：先直接相加，保留0，1，2等原值。再对所得的字符串按是否大于等于2来向前进位。
 * AC：Runtime: 0 ms, faster than 100.00% of C++ online submissions for Add Binary.
 * Memory Usage: 8.9 MB, less than 56.36% of C++ online submissions for Add Binary.
 *
 */
class Solution {
public:
    string addBinary(string a, string b) {
        vector<char> avec, bvec;
        for (int i = 0; i < a.length(); i++)
            avec.push_back(a[i]);
        for (int i = 0; i < b.length(); i++)
            bvec.push_back(b[i]);

        int range = avec.size() < bvec.size() ? avec.size() : bvec.size();
        if (avec.size() > bvec.size())
            swap(avec, bvec);

        for (int i = range - 1; i >= 0; i--) {
            bvec[bvec.size() - (range - i)] = char(int(bvec[bvec.size() - (range - i)] - int('0')) + int(avec[i]));
        }

        for (int i = bvec.size() - 1; i >= 0; i--) {
            if (int(bvec[i]) >= int('2')) {     // '2', '3' 转换成 '0', '1'
                bvec[i] = char(int(bvec[i]) - 2);
                if (i != 0) {
                    bvec[i - 1] = char(int(bvec[i - 1]) + 1);
                }
                else {
                    bvec.insert(bvec.begin(), '1');
                }
            }
        }
        
        string ans = "";
        for (int i = 0; i < bvec.size(); i++)
            ans += bvec[i];

        return ans;
    }
};