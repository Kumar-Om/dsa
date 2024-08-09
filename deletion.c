#include<stdio.h>

void deletion(int arr[],int index,int* size){
    

    for(int i=index;i<=*size;i++){
        arr[i]=arr[i+1];

    }
    
    (*size)--;
}


int main(){
    int arr[100]={1,3,4,5,44,66};
    int size=6;
    
    int index=2;

    deletion(arr,index,&size);
    
    for(int i=0;i<size;i++){
        printf("%d\n",arr[i]);
    }
}