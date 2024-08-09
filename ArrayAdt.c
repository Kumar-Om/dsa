//abstract data type(adt)
  
#include<stdio.h>
#include<stdlib.h>

struct myArray{
    int total_size;
    int used_size;
    int* ptr;

};

void createArray(struct myArray* a,int tsize,int usize){
    a->total_size=tsize;
    a->used_size=usize;
    a->ptr=(int*)malloc(tsize*sizeof(int));
}

void set(struct myArray* a){
    int n;
    for(int i=0;i<a->used_size;i++){
        scanf("%d",&n);
        (a->ptr)[i]=n;
    }
}

void get(struct myArray* a){
    for(int i=0;i<a->used_size;i++){
        printf("%d\n",(a->ptr)[i]);
    }
}

int main(){
    struct myArray arr;
    createArray(&arr,10,3);
    printf("enter elements:\n");
    set(&arr);
    printf("elements are:\n");
    get(&arr);
    return 0;
}