#include <string>
#include <stdio.h>
#include <cmath>
#include <cstring>
#include <algorithm>

using namespace std;
int a[200];

bool compare(int a, int b)
{
    return a > b;
}

int max(int a, int b)
{
    return a > b ? a : b;
}

int main()
{
    int t, n, s, r;
    scanf("%d", &t);
    for (int i = 0; i < t; i++)
    {
        memset(a, 0, sizeof(a));
        scanf("%d", &n);
        for (int j = 0; j < n; j++)
        {
            scanf("%d%d", &s, &r);
            for (int k = (s + r - max(s, r) - 1) / 2; k <= (max(s, r) - 1) / 2; k++)
            {
                a[k] += 10;
            }
        }
        sort(a, a + 200, compare);
        printf("%d\n", a[0]);
    }
    return 0;
}
