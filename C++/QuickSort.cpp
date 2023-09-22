/* 
   Quick Sorting 
*/

#include <iostream>
using namespace std;

// Function to partition the array
int partition(int arr[], int low, int high)
{
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j <= high - 1; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return (i + 1);
}

// QuickSort function
void quickSort(int arr[], int low, int high)
{
    if (low < high) {
        int pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

void ShowData(int DataStore[],int size){
    cout<<"Show Data into the Data Store : ";
    for(int a=0; a<size; a++){
        cout<<DataStore[a]<<" ";
    }
    cout<<endl;
}

// Main function to input and sort the data
int main()
{
  int arr[] = {24,9,29,14,19,27};
  int size = sizeof(arr)/sizeof(arr[0]);

  quickSort(arr,0, size-1);
  ShowData(arr, size);

    return 0;
}