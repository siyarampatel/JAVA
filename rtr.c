#include<stdio.h>
void main(){
    // int a=7;
    // a>9?printf("hello"):printf("hii");
    int n;
    printf("enter n:");
    scanf("%d",&n);
   for(int i=0; i<=n; i++){
    for(int j=0; j<=i; j++){
        printf("*");
    }
    printf("\n");
   }
}