#include <stdio.h>
int *modify(int *a, int n){
    for(int i = 0; i < n; i++){
        a[i] += 1;
    }
    return a;
}
int main(void){
    int arr[] = {1,2,3};
    int *p = modify(arr, 3);
    for(int i = 0; i < 3; i ++){
        printf("%d ", p[i]);
    }
    printf("\n");
    return 0;
}