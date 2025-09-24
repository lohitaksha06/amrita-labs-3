#include <stdio.h>
int main(){
    int temperature;
    printf("enter your temperate: \n");
scanf("%d",&temperature);
if(temperature <= 0){
    printf("its very very cold");

}
else if(0 < temperature && temperature < 0){
    printf("its cold");

}
else if(10 < temperature && temperature <= 20){
    printf("its cool out");

}
else if(temperature >= 30){
    printf("its hot");
}
    return 0;
}