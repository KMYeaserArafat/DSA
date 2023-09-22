#include<iostream>
using namespace std;

void InsertData(int DataStore[], int space){
    cout<<"Input Data into the Data Store : ";
    for(int a=0; a<space; a++){
        cin>>DataStore[a];
    }
    cout<<endl;
}

void SortingData(int DataStore[], int space){
    int temp;
    for(int a=0; a<space; a++){
        for(int b=a+1; b<space; b++){
            if(DataStore[a]>DataStore[b]){
                temp= DataStore[a];
                DataStore[a]= DataStore[b];
                DataStore[b]=temp;
            }
        }
    }
}


void PrintData(int DataStore[], int space){
    cout<<"Show Sorting Data : ";
    for(int a=0; a<space; a++){
        cout<<DataStore[a]<<" ";
    }
    cout<<endl;
}


int BinarySearch(int DataStore[],int search, int low, int high){

    while(low<=high){
        int mid = low +(high-low)/2;

        if(DataStore[mid]==search){
            return mid;
        }
        else if(DataStore[mid]<search){
            low = mid+1;
        }
        else if(DataStore[mid]>search){
            high = mid-1;
        }
    }
    return -1;
}


int main(){

    int space;
    cout<<"How Many Data Want to Insert : ";
    cin>>space;

    int DataStore[space];
    InsertData(DataStore, space);
    SortingData(DataStore,space);
    PrintData(DataStore,space);

    int search;
    cout<<"Enter Search Data into the Data Store : ";
    cin>>search;

    int len = sizeof(DataStore)/sizeof(DataStore[0]);
    
    int low = 0;
    int high = len-1;

    int result = BinarySearch(DataStore,search,low, high);

    if(result==-1){
        cout<<"Search Data Not found !" <<endl;
    }
    else{
        cout<<"Element found at Index  : "<< result<<endl;
        cout<<"Show the Data : "<< DataStore[result]<<endl;
    }





    return 0;
}