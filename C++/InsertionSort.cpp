// Insertion Sort, 

#include<iostream>
using namespace std;

void InsertionSort(int DataStore[], int sizeOfDataStore){
    for(int a=1; a<sizeOfDataStore; a++){
        int key = DataStore[a];
        int previousIndex = a-1;

        while(key<DataStore[previousIndex] && previousIndex >= 0){
            DataStore[previousIndex+1] = DataStore[previousIndex];
            --previousIndex;
        }
        
        DataStore[previousIndex+1] = key;


    }
}

void ShowData(int DataStore[], int sizeOfDataStore){
    cout<<"Show Data Store : ";
    for(int a =0; a<sizeOfDataStore; a++){
        cout<<DataStore[a]<< "  ";
    }
    cout<<endl;
}

int main(){

    int DataStore[] = {5,9,1,4,3};
    int sizeOfDataStore = sizeof(DataStore)/sizeof(DataStore[0]);

    InsertionSort(DataStore,sizeOfDataStore);
    ShowData(DataStore,sizeOfDataStore);



    return 0;
}