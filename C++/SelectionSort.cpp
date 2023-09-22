// Selection Sort, 

#include<iostream>
using namespace std;

void Selection(int DataStore[],int size){
   for(int a=0; a<size-1; a++){
    int minIndex= a;
    for(int b=a+1; b<size; b++){
        if(DataStore[minIndex]> DataStore[b]){
            minIndex = b;
        }
        int temp =  DataStore[minIndex];
        DataStore[minIndex] = DataStore[a];
        DataStore[a] = temp;
    }
   }
}

void ShowData(int DataStore[], int size){
    cout<<"Show Data Store : ";
    for(int a=0; a<size; a++){
        cout<<DataStore[a]<<" ";
    }
    cout<<endl;
}

int main(){

    int DataStore[] = {20,12,10,15,2};
    int size = sizeof(DataStore)/sizeof(DataStore[0]);
    Selection(DataStore,size);
    ShowData(DataStore,size);


    return 0;
}