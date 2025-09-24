#include <stdio.h>
typedef struct {
    //use type def behind the struct name if you wanna just get a single variable
    char name[20];
    int roll_no;
    float gpa;
    Course c1;
} Student;
typedef struct { //not necessary to type it in top
    int courseid;
    int marks;
    int credits;

} Course;
int main(){
    Course c1 = {1,34,8};
    Student s1 = {"harold",23,6.8,c1};
    printf("name is %s and roll is %d and gpa is %f course is %d,%d,%d",s1.name,s1.roll_no,s1.gpa,s1.c1.courseid,s1.c1)
    return 0;
    
}
