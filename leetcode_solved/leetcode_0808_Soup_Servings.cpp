/**
 * 思路：喝汤问题。
 * 起始有等量的 N ml 的 A,B 两种汤，定义了四种舀汤的操作，每次随机执行一种舀汤操作的一次操作。
 * 如果某一次舀汤时不能按预期数量提供，那么尽可能多的接近要求提供汤。
 * 当两种汤都舀空时，操作终止。
 * 输出是求概率 P = P(A 汤先被要舀空) + P(A,B 汤同时被舀空) / 2
 *
 */
class Solution {
public:
    double memo[200][200];
    double soupServings(int N) {
        return N >= 4800 ?  1.0 : f((N + 24) / 25, (N + 24) / 25);
    }
    double f(int a, int b) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1;
        if (b <= 0) return 0;
        if (memo[a][b] > 0) return memo[a][b];
        memo[a][b] = 0.25 * (f(a-4,b)+f(a-3,b-1)+f(a-2,b-2)+f(a-1,b-3));
        return memo[a][b];
    }
};
