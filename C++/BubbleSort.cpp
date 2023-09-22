//Bubble Sort,
#include<iostream>
using namespace std;

//Bubble Sort,
void BubbleSort(int DataStore[], int len){
  int temp;
  for(int i=0; i<len; i++){
    for(int j=0; j<len-i-1; j++){
        if(DataStore[j]>DataStore[j+1]){
            temp = DataStore[j];
            DataStore[j]=DataStore[j+1];
            DataStore[j+1] = temp;
        }
    }
  }
}

//Print DataStore,
void PrintData(int DataStore[],int len){
    cout<<"Show Data Store : ";
    for(int a=0; a<len; a++){
        cout<<DataStore[a]<<" ";
    }
    cout<<endl;
}

int main(){
    int DataStore[] = {-2,45,0,11,-9};
    int len = sizeof(DataStore)/sizeof(DataStore[0]);

    BubbleSort(DataStore,len);
    PrintData(DataStore,len);



    return 0;
}