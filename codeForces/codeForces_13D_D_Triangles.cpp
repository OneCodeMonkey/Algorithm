/**
 * 题意：题意，在一个平面上，给定 N 个红色点和 M 个蓝色点（任意三点不共线），求有多少个独立三角形能由
 * 		 红色点组成，且内部不包含蓝色点。
 * 限制条件：1. 所有坐标点的横，纵坐标绝对值不大于 10^9
 *			2. 0 <= N, M <= 500
 *	        3. 每个用例运行时间不超过 2s， 运行内存不大于 64M
 *
 * 解题思路：这是个计算几何的问题，
 *
 * AC：
 * Time: 1122 ms
 * Memory:800 KB
 *
 */
#include<stdio.h>
#include<map>
#include<utility>

using namespace std;

typedef long long ll;
const int INF = 0x3f3f3f3f, maxn = 505;
struct Point
{
	int x, y;
	Point() {};
	Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	Point operator- (const Point &b) const
	{
		return Point(x - b . x, y - b . y);
	}
	ll operator* (const Point &b) const
	{
		return (ll)x * b . y - (ll)y * b . x;
	}
}a[maxn], b[maxn];
int n, m, dp[maxn][maxn];

int main() {
	scanf("%d%d", &n, &m);

	for (int i = 1; i <= n; i++) {
		scanf("%d%d", &a[i] . x, &a[i] . y);
	}
	for (int i = 1; i <= m; i++) {
		scanf("%d%d", &b[i] . x, &b[i] . y);
	}

	a[0] = Point(-1e9 - 1, -1e9 - 1);

	for (int i = 1; i <= n; i++)
		for (int j = 1; j <= n; j++) {
			if ((a[i] - a[0]) * (a[j] - a[0]) <= 0)
				continue;
			for (int k = 1; k <= m; k++)
				if ((a[i] - a[0]) * (b[k] - a[0]) >= 0 \
					&& (a[j] - a[i]) * (b[k] - a[i]) >= 0 \
					&& (b[k] - a[0]) * (a[j] - a[0]) >= 0)
					dp[i][j]++;

			dp[j][i] = -dp[i][j];
		}

	int ans = 0;
	for (int i = 1; i <= n; i++)
		for (int j = i + 1; j <= n; j++)
			for (int k = j + 1; k <= n; k++)
				if (dp[i][j] + dp[k][i] + dp[j][k] == 0)
					ans++;

	printf("%d\n", ans);

	return 0;
}