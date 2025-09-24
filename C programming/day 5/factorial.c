#include <stdio.h>
#include <math.h>
int factorial(int n){
        
    if(n == 0 ){
        return 0;
    }
    if(n==1){
        return 1;
    }
    else{
        int b = n * factorial(n - 1);
        return b;
    }
}
int main(){

printf("enter your n value: ");
int a;
scanf("%d",&a);
int ans = factorial(a);
printf("%d",ans);
return 0;
}