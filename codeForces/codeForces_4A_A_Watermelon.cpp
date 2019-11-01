/**
 * codeforces入门第一题。
 * 题目也没说 0 也是偶数且 0 不算，所以 2 认为是 NO，注意这里就行了。
 *
 * AC:
 * Accepted	62 ms	0 KB
 */

#include<stdio.h>

int main() {
	int a = 0;
	scanf("%d", &a);
	if(a < 4) {
		printf("NO");
	} else if(a % 2 == 0)
		printf("YES");
	else
		printf("NO");

	return 0;
}