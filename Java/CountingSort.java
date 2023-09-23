/*
 * #Process Of Counting Sort, 
1. Declear output array, whose size is (size+1);
2. set the fist index number as a max variable, 
3. Compare the max with another index number;
4. Declear count variable, whose space is (max+1);
5. Initialize count array with all zeros (0 to max)
6. Store the count of each element (0 to size)
7. Store the cummulative count of each array
8. Find the index of each element of the original array in count array, 
   and place the elements in output array
 */

import java.util.Arrays;

public class CountingSort {

    public static void CountingSortMethod(int[] DataStore,int size){
        //Declear output array, whose size is (size+1);
        int[] output = new int[size+1];

        //set the fist index number as a max variable, 
        int max = DataStore[0];

        //Compare the max with another index number;
        for(int i = 0; i<size; i++){
            if(max<=DataStore[i]){
                max = DataStore[i];
            }
        }

       // Declear count variable, whose space is (max+1);
       int[] count = new int[max+1];

       //Initialize count array with all zeros (0 to max)
       for(int a=0; a<max; a++){
        DataStore[a] = 0;
       }

       //Store the count of each element (0 to size)
       for(int a=0; a<size; a++){
        count[DataStore[a]]++;
       }

       //Store the cummulative count of each array
       for(int i=1; i<=max; i++){
        count[i] += count[i-1];
       }

      // Find the index of each element of the original array in count array, and
      // place the elements in output array

      for(int i=size-1; i>=0; i--){
        output[count[DataStore[i]]-1] = DataStore[i];
        count[DataStore[i]]--;
      }

     // Copy the sorted elements into original array
     for(int i=0; i<size; i++){
        DataStore[i] = output[i];
     }




    }
    

    public static void main(String[] args) {
        int[] DataStore = {4, 2, 2, 8, 3, 3, 1};
        int size = DataStore.length;
        System.out.print("UnSorting Data : " + Arrays.toString(DataStore));
        CountingSortMethod(DataStore, size);
        System.out.print("  Sorting Data : " + Arrays.toString(DataStore));

    }
}
