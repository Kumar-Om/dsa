// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int arr[]={13,46,24,52,20,9};
    int n=6;
    
    for(int i=1;i<n;i++){
        int curr=arr[i];
        int j=i-1;
        while(j>=0 && curr<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=curr;
    }
    
    
    
    
    
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    

    return 0;
}