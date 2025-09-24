#include <stdio.h>
void cylindervolume(){
       float r = 5.0;
    float h = 10.0;
    float v = calculatecylinder(r, h);
    printf("volume of cylinder %.2f cm^3\n", v);

  
};
double cylindervolumecalculator(double r, double h){
    
    double v = r * r * h * 3.14;
    return v;
}  


int main() {
    cylindervolume();

    cylindervolumecalculator(5.4,4.5);
    
    
    return 0;
}

