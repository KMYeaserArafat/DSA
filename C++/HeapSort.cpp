/*  Heap Sort, 
process : 


*/

#include<iostream>
using namespace std;

// Find largest among root, left child, right child
void heapify(int DataStore[],int size,int i){
    int largest = i;
    int left = 2*i+1;
    int right = 2*i+2;

    if(left<size && DataStore[left]>DataStore[largest]){
        largest = left;
    }

    if(right<size && DataStore[right]>DataStore[largest]){
        largest = right;
    }

    // Swap and continue heapifying if root is not largest
    if(largest != i){
        swap(DataStore[i],DataStore[largest]);
        heapify(DataStore,size,largest);
    }
}


//Heap Sort Method, 
void HeapSort(int DataStore[],int size){
    // Max Heap,
    for(int i=size/2-1; i>=0; i--){
        heapify(DataStore,size,i);
    }

    //Heap Sort, 
    for(int i=size-1; i>=0; i--){
        swap(DataStore[0],DataStore[i]);
      // Heapify root element to get highest element at root again
      heapify(DataStore,i,0);
    }
}



//print Method, 
void ShowDataStore(int DataStore[],int size){
    for(int i=0; i<size; i++){
        cout<<DataStore[i]<<" ";
    }
    cout<<endl;
}


int main(){

    int DataStore[] = {1,12,9,5,6,10};
    int size = sizeof(DataStore)/sizeof(DataStore[0]);
    cout<<"UnSort DataStore : ";
    ShowDataStore(DataStore,size);
    HeapSort(DataStore,size);
     cout<<"  Sort DataStore : ";
    ShowDataStore(DataStore,size);


    return 0;
}