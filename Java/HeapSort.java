//Heap Sort,

public class HeapSort{


    //create heapy, 
    public static void heapy(int[] DataStore,int size,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<size && DataStore[left]>=DataStore[largest]){
            largest = left; 
        }

        if(right<size && DataStore[right]>=DataStore[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = DataStore[i];
            DataStore[i] = DataStore[largest];
            DataStore[largest] = temp;

            heapy(DataStore, size, largest);
        }
    }



    //Heap Sort Method, 
    public static void heapsort(int[] DataStore, int size){
        //max heap,
        for(int i=size/2-1; i>=0; i--){
            heapy(DataStore, size, i);
        }

        // Sort, 
        for(int i=size-1; i>=0; i--){
            int temp = DataStore[0];
            DataStore[0] = DataStore[i];
            DataStore[i] = temp;

            heapy(DataStore,i,0);
        }
    }


    //print DataStore,
    public static void ShowData(int[] DataStore,int size){
        for(int a=0; a<size; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] DataStore = {1,12,9,5,6,10};
        int size = DataStore.length;
        System.out.print("UnSort DataStore : ");
        ShowData(DataStore, size);
        heapsort(DataStore, size);
        System.out.print("  Sort DataStore : ");
         ShowData(DataStore, size);
    }
}