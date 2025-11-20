#include <stdio.h>
#include <stdlib.h>
typedef struct{
    int id;
    char name[50];
    int quantity;
    float price;

} Product;

void inputproduct(Product *product,int count){
    if(count >= 10){
        printf("cannot add more items");
        return count;
    }
    for(int i=0;i<count;i++){
    printf("enter your product values");
    scanf("%d,%s,%d,%f",&product->id,product->name,&product->quantity,&product->price);
    }
     
}
void displayproduct(Product *product,int count){
    printf("these are ur listed are product");
    for(int i=0;i<count;i++){
        printf("product %d %s %d %f",product[i].id,product[i].name,product[i].quantity,product[i].price);

    }
   
}
int main(){
    int n;
    
    Product *product;
    printf("enter number of products");
    scanf("%d",&n);
    product = (Product*) calloc(n,sizeof(Product));
    inputproduct(product,n);
    int more;
    print("how many more product do you wanna add");
    scanf("%d",&more);
    product = (Product*) realloc(product,(n+more) * sizeof(Product));
    displayProducts(product, n + more);


}

