public class SelectionSort {

    public void Selection(int[] DataStore, int size){

        for(int a=0; a<size-1; a++){
            int minIndex = a;
            for(int b=a+1; b<size; b++){
                if(DataStore[minIndex]>DataStore[b]){
                    minIndex = b;
                }
                int temp = DataStore[minIndex];
                DataStore[minIndex] = DataStore[b];
                DataStore[b] = temp;

            }
        }
    }

    void ShowData(int[] DataStore, int size){
        System.out.print("Show Data : ");
        for(int a=0; a<size; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        int[] DataStore = {20,12,10,15,2};
        int size = DataStore.length;

        SelectionSort ss = new SelectionSort();
        ss.Selection(DataStore, size);
        ss.ShowData(DataStore, size);

    }
}
