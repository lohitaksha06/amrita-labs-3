#include <stdio.h>

int main(void) {
	int n = 5, x = 1;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= i; j++) printf("%d ", x++);
		printf("\n");
	}
	return 0;
}
