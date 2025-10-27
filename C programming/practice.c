#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int id;
    char name[50];
    float price;
} Product;

void Inputproduct(Product *p){
    printf("enter your product id, name and price: ");
    scanf("%d %s %f", &p->id, p->name, &p->price);

}
void Displayproduct(Product *g,int count){
    printf("here are all your products");
    for(int i=0;i<count;i++){
        printf("your product id is %d, name is %s, quantity is %f",g[i].id,g[i].name,g[i].price);

    }

}
Product* addproducts(Product *g,int *count){
    if(*count >= 10){
        printf("you cannot add more than 10 products");
        return g;
    }
    Product *tmp = (Product*) realloc(g, (*count + 1) * sizeof(Product));
    if (tmp == NULL){
        printf("no memory to allocate");
        return g;
    }
    g = tmp;
    printf("enter your product details %d\n", *count + 1);
    Inputproduct(&g[*count]);
    (*count)++;
    return g;
}
int main(void){
    int n;
    Product *g = NULL;
    printf("enter initial number of products till 10: ");
    if (scanf("%d", &n) != 1 || n < 0 || n > 10) {
        return 0;
    }
    g = (Product*) calloc(n, sizeof(Product));
    printf("\nEnter details for %d products:", n);
    for (int i = 0; i < n; i++) {
        printf("Product %d:", i + 1);
        Inputproduct(&g[i]);
    }

    Displayproduct(g, n);

    g = addproducts(g, &n);

    if (g != NULL) {
        Displayproduct(g, n);
        free(g);
    }
    return 0;
}
 








