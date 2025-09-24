// 2.write a program to read 10 integer numbersin an array and print only the even numbers
#include <stdio.h>
#include <math.h>
int main(){
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    printf("enter your number: ");
    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);

    }
    for(int i = 0; i < 10; i++){
    if(arr[i] % 2 == 0){
        printf("%d",arr[i]);
        

    }
}
    return 0;
}