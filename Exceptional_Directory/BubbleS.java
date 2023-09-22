public class BubbleS {

    //Bubble Sorting method, 
    private void Sorting(int[] DataStore,int DataStoreSize){

        for(int a=0; a<DataStoreSize; a++){
            for(int b=a; b<DataStoreSize; b++){
                if(DataStore[a]>DataStore[b]){
                    int temp  = DataStore[b];
                    DataStore[b] = DataStore[a];
                    DataStore[a] = temp;
                }
            }
        }

        ShowData(DataStore, DataStoreSize);
    }
    

    //Show All DataStore Data Print method, 
    private void ShowData(int[] DataStore,int DataStoreSize){
        System.out.print("Show Data Store : ");
        int a=0; 
        while(a<DataStoreSize){
            System.out.print(DataStore[a]+ ",");
            a++;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int[] DataStore = {10,100,20,11,33,30,99,69,19,100};
        int DataStoreSize = DataStore.length;
        BubbleS bs = new BubbleS();
        System.out.print("Unsorting DataStore : ");
        bs.ShowData(DataStore, DataStoreSize);
        System.out.print("Sorting Data : ");
        bs.Sorting(DataStore, DataStoreSize);

    }
}
