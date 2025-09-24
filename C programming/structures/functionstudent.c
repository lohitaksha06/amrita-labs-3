#include <stdio.h>
typedef struct { //you just need to name it right side (bottom) new update
    //use type def behind the struct name if you wanna just get a single variable
    char name[20];
    int roll_no;
    float gpa;
} Student;


//if your using type def mention the structure name again
void display(Student s){

    printf("name is %s, roll number is %d and gpa is %f",s.name,s.roll_no,s.gpa);
};
int main(){
    Student s1 = {"harry",25,8.1};
    printf("%s\t,%d\t,%f\n",s1.name,s1.roll_no,s1.gpa);
    display(s1);
    return 0;
}