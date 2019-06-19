//把只参加一场的另一场名次赋值为同一场同名次队伍另一场的名次，但是不直接赋值，而
//先缓存（nex），并统计缓存次数（cgcnt），如果缓存仅一次，即没有总名次不同队伍的
//冲突，则真正把另一场赋值为nex。之后进行第一次排序。
//对于只参加一场而无其他参加两场的同名次队伍时，判断是否可合理插入，记录插入位置
//之后进行第二次排序，针对这次处理的这类队伍进行比较。
//输出，终名次相同者输出在同一行。
//单独写了完整的名次比较函数Compab()，函数中顺带处理了前两点所需数据。
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
const int maxn = 101;
typedef struct
{
    int rt[2];
    int num;
    int nex;
    int cgcnt;
    int share;
} TEAM;
TEAM te[maxn];
int n, m;
char buf[10001];
void ReadData(int n, int ith)
{
    int i, j, rank, cnt, tnum;
    for (i = rank = 1; i <= n; ++i, rank += cnt)
    {
        gets(buf);
        for (j = cnt = 0; buf[j]; ++j)
        {
            if (isdigit(buf[j]))
            {
                sscanf(buf + j, "%d", &tnum);
                te[tnum].rt[ith] = rank, ++cnt;
                te[tnum].num = tnum;
                while (isdigit(buf[j]))
                    ++j;
                --j;
            }
        }
    }
}
int Compab(TEAM &a, TEAM &b)
{
    if ((a.rt[0] || a.rt[1]) && !(b.rt[0] || b.rt[1]))
        return -1;
    if (!(a.rt[0] || a.rt[1]) && (b.rt[0] || b.rt[1]))
        return 1;
    if (a.cgcnt == -1 && b.cgcnt != -1)
        return a.rt[0] ? a.rt[0] - b.rt[0] : a.rt[1] - b.rt[1];
    if (b.cgcnt == -1 && a.cgcnt != -1)
        return b.rt[0] ? a.rt[0] - b.rt[0] : a.rt[1] - b.rt[1];
    if (a.cgcnt == -1 && b.cgcnt == -1)
    {
        if (a.share == b.share)
            return a.rt[0] ? a.rt[0] - (b.rt[0] ? b.rt[0] : b.rt[1]) : a.rt[1] - (b.rt[1] ? b.rt[1] : b.rt[0]);
        return a.share - b.share;
    }
    if (a.rt[0] && a.rt[1] && !(b.rt[0] && b.rt[1]))
    {
        if (b.rt[0] == a.rt[0])
        {
            if (!b.nex || b.nex + b.rt[0] == a.rt[0] + a.rt[1])
                b.nex = a.rt[1], b.share = a.num;
            else
                ++b.cgcnt;
        }
        else if (b.rt[1] == a.rt[1])
        {
            if (!b.nex || b.nex + b.rt[1] == a.rt[0] + a.rt[1])
                b.nex = a.rt[0], b.share = a.num;
            else
                ++b.cgcnt;
        }
        return -1;
    }
    if (b.rt[0] && b.rt[1] && !(a.rt[0] && a.rt[1]))
    {
        if (a.rt[0] == b.rt[0])
        {
            if (!a.nex || a.nex + a.rt[0] == b.rt[0] + b.rt[1])
                a.nex = b.rt[1], a.share = b.num;
            else
                ++a.cgcnt;
        }
        else if (a.rt[1] == b.rt[1])
        {
            if (!a.nex || a.nex + a.rt[1] == b.rt[0] + b.rt[1])
                a.nex = b.rt[0], a.share = b.num;
            else
                ++a.cgcnt;
        }
        return 1;
    }
    if ((a.rt[0] && a.rt[1]) && (b.rt[0] && b.rt[1]))
        return a.rt[0] + a.rt[1] - b.rt[0] - b.rt[1];
    if ((a.rt[0] || a.rt[1]) && (b.rt[0] || b.rt[1]))
    {
        if (a.rt[0] && b.rt[0])
            return a.rt[0] - b.rt[0];
        if (a.rt[1] && b.rt[1])
            return a.rt[1] - b.rt[1];
        return 0;
    }
}
int comp(const void *a, const void *b)
{
    return Compab(*(TEAM *)a, *(TEAM *)b) ? Compab(*(TEAM *)a, *(TEAM *)b) : (*(TEAM *)a).num - (*(TEAM *)b).num;
}
int Judge(TEAM &a, int ith)
{
    int i, j;
    for (i = 1; te[i].rt[0] && te[i].rt[1] && i < maxn; ++i)
        if (te[i].rt[ith] > a.rt[ith])
            break;
    j = i;
    for (; te[i].rt[0] && te[i].rt[1] && i < maxn; ++i)
        if (te[i].rt[ith] <= a.rt[ith])
            break;
    if (j < maxn && (Compab(te[j - 1], te[j]) == 0 || te[i].rt[0] && te[i].rt[1]))
        return a.rt[0] = a.rt[1] = a.cgcnt = 0;
    return a.cgcnt = -1, j;
}
int main()
{
    int i, j, k;
    while (scanf("%d\n", &n) != EOF)
    {
        memset(te, 0, sizeof(te));
        for (i = 0; i < maxn; ++i)
            te[i].num = i;
        ReadData(n, 0);
        scanf("%d\n", &m);
        ReadData(m, 1);
        for (i = 1; i < maxn; ++i)
            for (j = i + 1; j < maxn; ++j)
                Compab(te[i], te[j]);
        for (i = 1; i < maxn; ++i)
        {
            if (te[i].cgcnt)
                te[i].rt[0] = te[i].rt[1] = 0;
            else if (te[i].nex)
            {
                if (te[i].rt[0])
                    te[i].rt[1] = te[i].nex;
                else
                    te[i].rt[0] = te[i].nex;
            }
        }
        qsort(te + 1, 100, sizeof(TEAM), comp);
        for (i = 1; i < maxn; ++i)
        {
            if (te[i].rt[0] && !te[i].rt[1])
                te[i].share = Judge(te[i], 0);
            else if (!te[i].rt[0] && te[i].rt[1])
                te[i].share = Judge(te[i], 1);
        }
        qsort(te + 1, 100, sizeof(TEAM), comp);
        for (i = 1; (te[i].rt[0] || te[i].rt[1]) && i < maxn; i = j)
        {
            printf("%d", te[i].num);
            for (j = i + 1; (te[j].rt[0] || te[j].rt[1]) && !Compab(te[i], te[j]); ++j)
                printf(" %d", te[j].num);
            printf("\n");
        }
    }
    return 0;
}
