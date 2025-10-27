#include <stdio.h>
#include <stdlib.h>
typedef struct{
    int id;
    char name[50];
    float price;
} Product;

void inputproduct(Product *p,int start,int count){
    printf("enter your product");
    scanf("%d,%s,%f",p->id,p->name,p->price);

}
void displayproduct(Product *products,int count){
    printf("products");
    for(int i=0;i<count;i++){
        printf("%d,%s,%f",products[i].id,products[i].name,products[i].price);


    }
}
int main(){
    int n;
    int more;
    Product *products;
    products = (Product*) calloc(n, sizeof(Product));
     inputProducts(products, 0, n);
    printf("do you wanna add any more products? ");
    scanf("%d",&more);
    
}
