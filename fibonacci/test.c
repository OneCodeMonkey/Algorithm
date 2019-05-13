// test data structure:sequence_list
#include<stdio.h>
#include<stdlib.h>

int fibonacci(int i) {
	if (i <= 0) {
		return 0;
	}
	if (i == 1 || i == 2) {
		return 1;
	}
	return fibonacci(i - 1) + fibonacci(i - 2);
}


int main() {
	printf("__________________");
	int num_100 = fibonacci(45);
	printf("%d\n", num_100);
	printf("__________________");
	system("pause");
	return 0;
}