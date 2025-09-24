// write a c program that reads an interger n and uses void square (int input, int *result) to compute n*n by writting through the result then print it

#include <stdio.h>

 int square(int inpt) {
	int result = inpt * inpt;
    return &result;
}
int main(void){
  int n;
  
  printf("enter your number to be squared");
  scanf("%d",&n);
    int *result_ptr = square(n);
    printf("the square of %d is %d\n", n, *result_ptr);
    return 0;




}