//write a function void classifyEvenOdd(int n) that prints "even" or "odd" otherwise.
#include <stdio.h>


void classifyEvenOdd(int n) {
    if (n % 2 == 0) {
        printf("even\n");
    } else {
        printf("odd\n");
    }
}

int main() {
    int x;
    printf("Enter your number: ");
    scanf("%d", &x);

    classifyEvenOdd(x);  

    return 0;
}
