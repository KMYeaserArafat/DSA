
#include<iostream>
using namespace std;


void LinearSearch(int DataStore[], int size_of_Store, int search){
 
 int countData = 0;

    for(int a=0; a<size_of_Store; a++){
        if(DataStore[a]==search){
            countData = countData+1;
        }
    }

    if(countData !=0){
        cout<<search<<" Data Found "<< countData<<" times"<<endl;
    }
    else{
        cout<<search<<" Data not Found !"<<endl;
    }

}



int main(){

int DataStore[] = {20,10,30,5,9,7};
int size_of_Store = sizeof(DataStore)/sizeof(DataStore[0]);

cout<<"Enter search Value : ";
int search;
cin>>search;

LinearSearch(DataStore,size_of_Store,search);

    return 0;
}