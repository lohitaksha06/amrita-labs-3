//write a function int maxOfthree(int a, int b)
#include <stdio.h>


int maxOfThree(int a, int b, int c) {
    if (a >= b && a >= c) {
        return a;
    } else if (b >= a && b >= c) {
        return b;
    } else {
        return c;
    }
}

int main() {
    int x, y, z;

    printf("Enter three integers:\n");
    scanf("%d %d %d", &x, &y, &z);

    int max = maxOfThree(x, y, z);

    printf("The greatest number is: %d\n", max);
    return 0;
}
