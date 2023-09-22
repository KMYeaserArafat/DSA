//Marge Sort, 
#include<iostream>
using namespace std; 


//Devide,
void Devide(int DataStore[], int start, int mid,int end){
    //Declear length for the new 2 DataStore, 
    int len1 = mid-start+1;
    int len2 = end-mid;

    //Declear 2  DataStore, 
    int leftDataStore[len1];
    int rightDataStore[len2];

    //Include Data into the 2 DataStore, 
    for(int i=0; i<len1; i++){
        leftDataStore[i] = DataStore[start+i];
    }
    for(int j=0; j<len2; j++){
         rightDataStore[j] = DataStore[mid+1+j];
    }

    // Sorting,
    int i=0; 
    int j=0; 
    int k = start;
    while(i<len1 && j<len2){
        if(leftDataStore[i]<=rightDataStore[j]){
            DataStore[k] = leftDataStore[i];
            i++;
        }
        else{
            DataStore[k] = rightDataStore[j];
            j++;
        }
        k++;
    }


    while(i<len1){
        DataStore[k] = leftDataStore[i];
        i++;
        k++;
    }

    while(j<len2){
        DataStore[k] = rightDataStore[j];
        j++;
        k++;
    }
}



//MargeSort Method, 
void MargeSort(int DataStore[], int start, int end){

    if(start<end){
        int mid  = start + (end-start)/2;

        MargeSort(DataStore,start,mid);
        MargeSort(DataStore,mid+1,end);
        Devide(DataStore,start,mid,end);
    }
}


// Show DataStore, 
void ShowDataStore(int DataStore[], int size){
    cout<<"Show Data Store : ";
    for(int a=0; a<size; a++){
        cout<<DataStore[a]<<" ";
    }
    cout<<endl;
}

int main(){

    int DataStore[] = {10,2,20,30,60,40};
    int size = sizeof(DataStore)/sizeof(DataStore[0]);
    MargeSort(DataStore,0,size-1);
    ShowDataStore(DataStore,size);


}