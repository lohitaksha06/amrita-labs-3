// write a c program to print the size (in byte) of char, short, int , long float and double using the size of operator
#include <stdio.h>
int main(){
int a = 6;
int b = sizeof(a);
printf("%d\n",b);

printf("size of char is %d\n", sizeof(char));
printf("size of double is %d\n", sizeof(double));
printf("size of short is %d\n", sizeof(short));
printf("size of long is %d\n ", sizeof(long));
return 0;
}