// write a c program that declares a constant PI with values 3.14159 prompts the user to enter an integer radius then computes the circl'es area as pi * radius * radius and its circumference as 2 * pi * radius. finally the program should print oth results formatted to two decimal places

#include <stdio.h>
const float PI = 3.14159;
float calculateArea(int radius)
    {
        printf("the area of your circle is %f", radius * radius * PI);
        return radius * radius * PI;
    }
float calculatePerimeter(int radius)
    {
        printf("the circumference of your circle is %f", radius * 2 * PI);
        return radius * 2 * PI;
    }

int main()
{ // its est to keep functions out of main (est to keep it short and sweet ut it wouldnt hurt)
    
    
    int radius;
    
    printf("enter your radius value: ");
    scanf("%d", &radius);
    float area = calculateArea(radius);
    return 0;
}