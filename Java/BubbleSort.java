public class BubbleSort {

    //Sorting by Acending Order,
    public void BubbleSort_AcendingOrder(int[] DataStore,int len){
        int temp = 0;
        for(int a=0; a<len; a++){
            for(int b=0; b<len-a-1; a++){
                if(DataStore[b]>DataStore[b+1]){
                    temp = DataStore[b];
                    DataStore[b] = DataStore[b+1];
                    DataStore[b+1] = temp;
                }
            }
        }
    }


    // Show Data,
    public void ShowDataStore(int[] DataStore, int len){
        System.out.print("Show Data Store : ");
        for(int a=0; a<len; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
    }
    

    public static void main(String[] args){
        
        int[] DataStore = {-2,45,0,11,-9};
        int len = DataStore.length;

        BubbleSort bs = new BubbleSort();
        bs.BubbleSort_AcendingOrder(DataStore, len);
        bs.ShowDataStore(DataStore, len);
    }
}
