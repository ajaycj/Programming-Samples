/* 
 * File:   MergeSort.cpp
 * Author: Ajay C J
 *
 * 
 */
#include <iostream>
#include <cstdlib>
#include <math.h>
using namespace std;

void merge(int arr[], int size, int low, int middle, int high){
    /* to merge, create a temporary array of size of formal parameter size*/
    int temp[size];
    for (int i = low; i <= high; i++){
        temp[i] = arr[i];
    }
    int i = low;
    int j = middle+1;
    int k = high;
    while(i <= middle && j <= high){
        if(temp[i] <= temp[j]){
            arr[k] = temp[i];
            i++;
        }
        else {
            arr[k] = temp[j];
            j++;
        }
        k++;
    }
    while ( i <= middle){
        arr[k] = temp[i];
        k++;
        i++;
    }
}

void mergesort(int arr[], int size, int low, int high){
    if(low<high){
        int middle = ceil((low+high)/2);
        mergesort(arr, size, low, middle);
        mergesort(arr, size, middle+1, high);
        merge(arr, size, low, middle, high);
    }
}

int main(){
   int size = 10;
   int numbers[] = {5, 10, 1, 6, 2, 9, 3, 8, 7, 4};
   mergesort(numbers, size, 0, 9);
   for (int i = 0; i < 10; i++){
       cout<<numbers[i]<<endl;
    }
   return 0;
}
