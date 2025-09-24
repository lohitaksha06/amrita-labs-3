#include <stdio.h> //<assert.h,(math.h)(bool.h)(time.h) are some more
int x;
int main(){
int y;
printf("enter x and y: ");
scanf("%d %d", &x, &y);
int z = x + y;
printf("%d",z);
return 0;
}