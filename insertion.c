#include<stdio.h>

int insertion(int arr[],int element,int index,int* size,int capacity){
    if(*size>=capacity){
        return -1;
    }

    for(int i=*size-1;i>=index;i--){
        arr[i+1]=arr[i];

    }
    arr[index]=element;
    (*size)++;
}


int main(){
    int arr[100]={1,3,4,5,44,66};
    int size=6;
    int element=33;
    int index=6;

    insertion(arr,element,index,&size,100);
    
    for(int i=0;i<size;i++){
        printf("%d\n",arr[i]);
    }
}