#include <stdio.h>
#include <cstdlib>
#include <stack>
#include <vector>
#include <string.h>

int sur[4][10][25][25];
int n;
int cube[25][25][25], vis[25][25][25];
void makesur()
{
    int p, i, j, k;
    for (p = 0; p < 3; p++)
    {
        for (k = 2; k <= 4; k++)
        {
            for (i = 1; i <= n; i++)
            {
                for (j = 1; j <= n; j++)
                {
                    sur[p][k][j][n - i + 1] = sur[p][k - 1][i][j];
                }
            }
        }
        for (k = 1; k <= 4; k++)
        {
            for (i = 1; i <= n; i++)
            {
                for (j = 1; j <= n; j++)
                {
                    sur[p][k + 4][n - i + 1][j] = sur[p][k][i][j];
                }
            }
        }
    }
}

void fill(int a1, int a2, int a3)
{
    int i, j, k;
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
        {
            if (!sur[0][a1][i][j])
            {
                for (k = 1; k <= n; k++)
                {
                    cube[i][j][k] = 0;
                }
            }
        }
    }
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
            if (!sur[1][a2][i][j])
                for (k = 1; k <= n; k++)
                {
                    cube[k][i][j] = 0;
                }
    }
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            if (!sur[2][a3][i][j])
                for (k = 1; k <= n; k++)
                    cube[i][k][j] = 0;
}

bool check(int a1, int a2, int a3)
{
    int i, j, k, flag;
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            if (sur[0][a1][i][j])
            {
                flag = 0;
                for (k = 1; k <= n; k++)
                    if (cube[i][j][k])
                    {
                        flag = 1;
                        break;
                    }
                if (!flag)
                    return 0;
            }
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
            if (sur[1][a2][i][j])
            {
                flag = 0;
                for (k = 1; k <= n; k++)
                    if (cube[k][i][j])
                    {
                        flag = 1;
                        break;
                    }
                if (!flag)
                    return 0;
            }
    }
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            if (sur[2][a3][i][j])
            {
                flag = 0;
                for (k = 1; k <= n; k++)
                    if (cube[i][k][j])
                    {
                        flag = 1;
                        break;
                    }
                if (!flag)
                    return 0;
            }
    return 1;
}

void dfs(int i, int j, int k)
{
    if (i < 1 || i > n || j < 1 || j > n || k < 1 || k > n)
        return;
    if (vis[i][j][k])
        return;
    if (!cube[i][j][k])
        return;
    vis[i][j][k] = 1;
    dfs(i + 1, j, k);
    dfs(i - 1, j, k);
    dfs(i, j + 1, k);
    dfs(i, j - 1, k);
    dfs(i, j, k + 1);
    dfs(i, j, k - 1);
}

bool block_chk()
{
    int i, j, k;
    memset(vis, 0, sizeof(vis));
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            if (cube[i][j][1])
            {
                dfs(i, j, 1);
                goto aa;
            }
aa:;
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            for (k = 1; k <= n; k++)
                if (!vis[i][j][k] && cube[i][j][k])
                    return 0;
    return 1;
}

bool solve()
{
    int i, j, k;
    makesur();
    for (i = 1; i <= 8; i++)
        for (j = 1; j <= 8; j++)
            for (k = 1; k <= 8; k++)
            {
                memset(cube, 1, sizeof(cube));
                fill(i, j, k);
                if (check(i, j, k) && block_chk())
                    return 1;
            }
    return 0;
}

int main()
{
    int T = 0;
    int p, i, j;
    char c;
    while (scanf("%d", &n), n)
    {
        for (p = 0; p < 3; p++)
        {
            for (i = 1; i <= n; i++)
            {
                getchar();
                for (j = 1; j <= n; j++)
                {
                    c = getchar();
                    if (c == 'X')
                        sur[p][1][i][j] = 1;
                    else
                        sur[p][1][i][j] = 0;
                }
            }
        }
        printf("Data set %d: ", ++T);
        if (solve())
        {
            puts("Valid set of patterns");
        }
        else
            puts("Impossible combination");
    }
    return 0;
}