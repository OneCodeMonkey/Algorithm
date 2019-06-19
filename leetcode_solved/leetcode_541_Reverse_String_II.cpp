//cpp.Leetcode OJ Contest23 Reverse String II_Leetcode541

/*大意:就是我有一串字符，每2k个字符，只把前K个反转，计剩下还有len个字符，如果剩下的字符 大于K小于2K，那么只反转前K个，剩下 len-K个保持不动； 如果剩下的不足K个，那么len个全部反转; */

#include <iostream>
#include <cstring>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <string>
using namespace std;

int main()
{
    //这里测试用的，提交时写到 class {} 就行了
    string s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
    int k = 39;
    char ch_temp;
    if (s.length() < k)
    {
        for (int i = 0; i < s.length() / 2; i++)
        {
            ch_temp = s[i];
            s[i] = s[s.length() - 1 - i];
            s[s.length() - 1 - i] = ch_temp;
        }
        cout << s;
    }
    else if (s.length() >= k && s.length() < 2 * k)
    {
        for (int i = 0; i < k / 2; i++)
        {
            ch_temp = s[i];
            s[i] = s[k - 1 - i];
            s[k - 1 - i] = ch_temp;
        }
        cout << s;
    }
    else
    {
        int i = 0, t = 0;
        while (t * 2 * k <= s.length() - 1)
        {
            if ((s.length() - (i + t * 2 * k)) >= k && (s.length() - (i + t * 2 * k)) < 2 * k)
            {
                for (i = 0; i < k / 2; i++)
                {
                    ch_temp = s[i + t * 2 * k];
                    s[i + t * 2 * k] = s[t * 2 * k + k - 1 - i];
                    s[t * 2 * k + k - 1 - i] = ch_temp;
                }
                i = 0, t++;
            }
            else if ((s.length() - (i + t * 2 * k)) < k)
            {
                int len = s.length() - (i + t * 2 * k);
                for (i = 0; i < len / 2; i++)
                {
                    ch_temp = s[i + t * 2 * k];
                    s[i + t * 2 * k] = s[len - 1  - i + t * 2 * k];
                    s[len - 1 - i + t * 2 * k] = ch_temp;
                }
                i = 0, t++;
            }
            else
            {
                for (i = 0; i < k / 2; i++)
                {
                    ch_temp = s[i + t * 2 * k];
                    s[i + t * 2 * k] = s[k - 1 - i + t * 2 * k];
                    s[k - 1 - i + t * 2 * k] = ch_temp;
                }
                i = 0, t++;
            }
        }
        cout << s;
    }
    return 0;
}
