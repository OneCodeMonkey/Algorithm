/**
 * 思路：矩形用小正方形填充，只需行和列取整就行了。
 * 注意陷阱，不要用 int32，否则结果打印不了最大 10^18 这样的大数
 * AC：
 * Time:31 ms	Memory:0 KB
 *
 */
#include<stdio.h>
#include<map>
#include<utility>

using namespace std;

int main()
{
	int n, m, a;
	long long row = 0, col = 0, ans = 0;
	scanf("%d%d%d", &n, &m, &a);
	if (n % a == 0) {
		col = n / a;
	}
	else {
		col = n / a + 1;
	}
	if (m % a == 0) {
		row = m / a;
	}
	else {
		row = m / a + 1;
	}

	ans = row * col;
	printf("%lld", ans);
	return 0;
}