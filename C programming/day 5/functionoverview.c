#include <stdio.h>
#include <string.h> 

int main(){
char barry[] = 'cool';
int n = sizeof(barry)/sizeof(barry[0]);

int d = isalpha(barry[0]);
int e = isalpha(barry[1]);
int f = isalpha(barry[2]);
int g = isalpha(barry[3]);
printf("%d,%d,%d,%d,%d",d,e,f,g);
printf("number of alpha characters is %d",d + e + f + g);
int h = isalnum(barry[0]);
int t = isalnum(barry[1]);
int j = isalnum(barry[2]);
int k = isalnum(barry[3]);
printf("number of alpha characters is %d",h+ t +j + k);
//for(int i = 0; i < n, i++){
  //  printf("number of  upper values is barry is %d",isupper(barry[i]) );
    //barry[i++];
//}
//for(int i = 0; i < n, i++){
  //  printf("number of lower values is barry is %d",islower(barry[i]) );
    //barry[i++];
//}

char hi = 'd';
char bye = toupper(hi);
char hello[5]; 
printf("enter your string: ");
scanf("%s",&hello[5]);
printf("the to upper version is %c",bye);
return 0;

}