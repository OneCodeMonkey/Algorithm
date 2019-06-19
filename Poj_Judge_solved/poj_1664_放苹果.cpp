#include <iostream>
#include <stdio.h>
using namespace std;
int solve(int m, int n)
{
        if (m == 1 || n == 1) return 1;
        else if (m < n) return solve(m, m);
        else if (m == n) return 1 + solve(m, n - 1);
        else return solve(m - n, n) + solve(m, n - 1);
}
int main()
{
        int t, temp1, temp2;
      //输入的组数
    cin >> t;
        for (int i = 1; i <= t; i++)
    {
                cin >> temp1 >> temp2;
                cout << solve(temp1, temp2) << endl;
           
    }
        return 0;
}
