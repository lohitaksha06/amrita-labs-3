#include <stdio.h>
int main(){
int sum = 0;
int x;
printf("enter your number: ");
scanf("%d",&x);
while(x > 0){
    int res = x % 10; 
    sum = sum + res;
    x = x/10;
}
printf("%d", sum);
    return 0;
}