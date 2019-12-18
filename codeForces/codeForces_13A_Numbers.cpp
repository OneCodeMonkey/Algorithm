/**
 * 思路：没有优化的部分，只需依次算出 2，n-1 进制下的各位加和。注意最后表示分数的时候要做简化，先求出最大公约数。
 * AC：
 * Time:62 ms	Memory:0 KB
 *
 */
#include<stdio.h>
#include<map>
#include<utility>
#include<math.h>

using namespace std;

int gcd(int a, int b)
{
	if(a <= 0 || b <= 0)	// exception
		return 0;
	if (a < b)
		std::swap(a,b);
	if(a % b == 0)
		return b;
	else
		return gcd(b, a % b);
}

int main()
{
	int n, m = 0, sum = 0;
	scanf("%d", &n);
	for(int i = 2; i < n; i++) {
		m = n;
		while(m) {
			sum += m % i;
			m /= i;
		}
	}

	int z = gcd(sum, n - 2);
	int x = sum / z;
	int y = (n - 2) / z;
	printf("%d/%d", x, y);

	return 0;
}