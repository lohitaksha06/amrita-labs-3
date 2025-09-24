#include <stdio.h>
typedef struct student{
    //use type def behind the struct name if you wanna just get a single variable
    char name[20];
    int roll_no;
    float physics;
    float chem;
    float maths;
    float eng;
    float geo;
};
int main(){
    struct student s1 = {"barry",25,56,67.8,42,90.1,34};
    printf("%s\t,%d\t,%f\t,%f\t,%f\t,%f\t,%f",s1.name,s1.roll_no,s1.physics,s1.chem,s1.maths,s1.eng,s1.geo);
    return 0;
    
}