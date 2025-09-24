#include <stdio.h>
int main(){

    int year;
    scanf("%d", &year); // using nested loop
    if (year % 100 == 0)
    {
    
    
        if (year % 400 == 0){
            printf("leap year/n");
        }
    }
    return 0;
}