// asking user for int and float and then adding
#include <stdio.h>
int main(){
int a;
scanf("%d",&a);
printf("enter your integer number: %d\n", a);
float b;
scanf("%f",&b);
printf("enter your decimal value: %f\n", b);
float c = a + b;
printf("the sum of your numbers: %f\n", c);
return 0;
}