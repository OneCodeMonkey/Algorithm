/**
 * 思路：矩形用小正方形填充，只需行和列取整就行了。
 * 注意陷阱，不要用 int32，否则结果打印不了最大 10^18 这样的大数
 * AC：
 * Time:15 ms	Memory:0 KB
 *
 */
#include<stdio.h>
#include<math.h>

int main()
{
	int n, m, a;
	long long ans = 0;
	scanf("%d%d%d", &n, &m, &a);
	ans = ceil((double)n / a) * ceil((double)m / a);	// floor() 和 ceil() 的入参都是 double型
	printf("%lld", ans);
	return 0;
}