public class InsertionS {


    //Insertion Sort, 
    private static void InsertionSort(int[] DataStore,int size){
        for(int a=1; a<size; a++){
            int key = DataStore[a];
            int previousIndex = a-1;

            while(key<DataStore[previousIndex] && previousIndex>=0){
                DataStore[previousIndex+1] = DataStore[previousIndex];
                previousIndex  = previousIndex-1;
            }
            DataStore[previousIndex+1] = key;
        }
    }



    //Show DataStore, 
    private static void ShowData(int[] DataStore,int size){
        System.out.print("Show DataStore : ");
            for(int a=0; a<size; a++){
                System.out.print(DataStore[a] + " ");
            }
            System.out.println(" ");
    }
    
    public static void main(String[] args) {
        int[] DataStore = {20,1,2,30,3,50};
        int size = DataStore.length;
        InsertionSort(DataStore, size);
        ShowData(DataStore, size);
    }
}
