public class InsertionSort {

    //Insertion Sort, 
    public void Insertion(int[] DataStore, int sizeOfDataStore){
        for(int a=1; a<sizeOfDataStore; a++){
            int key = DataStore[a];
            int previousIndex = a-1;

            while(key<DataStore[previousIndex] && previousIndex>=0){
                DataStore[previousIndex+1] = DataStore[previousIndex];
                --previousIndex;
            }
            DataStore[previousIndex+1] = key;

        }
    }

    //Show Data, 
    public void ShowData(int[] DataStore, int sizeOfDataStore){
        System.out.print("Show the Data  : ");
        for(int a=0; a<sizeOfDataStore; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        int[] DataStore = {5,9,1,4,3};
        int sizeOfDataStore = DataStore.length;
        InsertionSort Is = new InsertionSort();
        Is.Insertion(DataStore, sizeOfDataStore);
        Is.ShowData(DataStore, sizeOfDataStore);

    }
}
