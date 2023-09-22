//Quick Sort, 

#include<iostream>
using namespace std;

int Partition(int DataStore[],int low,int high){
    int pivot = DataStore[high];
    int i = low-1;
    int temp = 0;
    for(int x=low; low<high; x++){
        if(pivot>=DataStore[x]){
            i++;
            temp = DataStore[i];
            DataStore[i] = DataStore[x];
            DataStore[x] = temp;
        }
    }
    temp = DataStore[i+1];
    DataStore[i+1] = DataStore[high];
    DataStore[high] = temp;

    return (i+1);
    
}


void QuickSort(int DataStore[], int low,int high){
    if(low<high){
        int p = Partition(DataStore,low,high);
        QuickSort(DataStore,low,p-1);
        QuickSort(DataStore,p+1,high);
    }
}




//print DataStore,
void PrintDataStore(int DataStore[], int size){
    cout<<"Show Data Store : ";
    for(int a=0; a<size; a++){
        cout<<DataStore[a]<<" ";
    }
    cout<<endl;
}


int main(){

int DataStore[] = {24,9,29,14,19,27};
int size = sizeof(DataStore)/sizeof(DataStore[0]);
int low = 0;
int high = size-1;
QuickSort(DataStore,low,high);
PrintDataStore(DataStore,size);

    return 0;
}