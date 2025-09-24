#include <stdio.h>
int main(){
    int temperature;
    printf("enter your temperature: ");
    scanf("%d",&temperature);
    switch(temperature) {
        case 100:  //using switch case
            printf("Water is your boiling point.\n");
            break;
        case 357:
            printf("Mercury is your boiling point.\n");
            break;
        case 1187:
            printf("copper is the boiling point.\n");
            break;
        
        default:
            printf("substance unknown.\n");
            break;
    }
    
    return 0;
}