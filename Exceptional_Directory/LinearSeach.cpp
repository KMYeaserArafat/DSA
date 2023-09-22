//Linear Search , 

#include<iostream>
using namespace std;

void LinearSearch(int DataStore[],int size,int searchData){
     int count = 0;
     for(int a=0; a<size; a++){
        if(searchData==DataStore[a]){
           count+=1;
        }
     }

     if(count !=0){
        cout<<"Search Data is found !"<<endl;
     }
     else{
         cout<<"Search Data is not found"<<endl;
     }
}


void printDataStore(int DataStore[], int length){
    cout<<"Show DataStore : ";
    for(int a=0; a<length; a++){
        cout<<DataStore[a]<<",";
    }
    cout<<endl;
}

int main(){

    int DataStore[] = {20,30,10,60,50};
    int length = sizeof(DataStore)/sizeof(DataStore[0]);

    printDataStore(DataStore,length);
     
    int SearchData; 
    cout<<"Enter Search Data : ";
    cin>>SearchData;
    LinearSearch(DataStore,length,SearchData);


    return 0;
}