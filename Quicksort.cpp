/* 
 * File:   Quicksort.cpp
 * Author: Ajay C J
 *
 * Created on 20 August, 2015, 9:45 PM
 */

#include <iostream>
#include <cstdlib>
using namespace std;

void quickSort(int arr[], int first, int last){
    int i = first;int j = last;int pivot,tmp;
    /* Select a pivot element*/
    if((first+last )%2 == 0){
        pivot = arr[(first+last)/2];
    }
    else pivot = arr[((first+last)/2)+1];
    while ( 1 ){
        while(arr[i]<pivot){
            i++;
        }
        while(arr[j] > pivot){
            j--;
        }
        if(i <= j){
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = arr[i];
            i++;
            j--;
        }
    }
    if(first < j){
        quickSort(arr, first, j);
    }
    if (i < last){
        quickSort(arr, i, last);
    }
}

 

 
int main()
{
    int arr[] = {1,2,3,6,4,7,8};
    quickSort(arr, arr[0], arr[sizeof(arr)-1]);
}    