

//Quick Sort, 
public class QuickSort{

    public int Partition(int[] DataStore, int low, int high){
        int pivot = DataStore[high];
        int i = low-1;

        for(int j=low; j<=high-1; j++){
            if(DataStore[j]<=pivot){
                i++;
                int temp = DataStore[i];
                DataStore[i] =  DataStore[j];
                DataStore[j] = temp;
            }
        }
        int temp = DataStore[i+1];
        DataStore[i+1] = DataStore[high];
        DataStore[high] = temp;
        return (i+1);
    }

    public void Quick(int[] DataStore, int low, int high){
        if(low<high){
            int p = Partition(DataStore, low, high);

            Quick(DataStore, low, p-1);
            Quick(DataStore, p+1, high);
        }
    }


    public void ShowData(int[] DataStore, int size){
        for(int a=0; a<size; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] DataStore = {24,9,29,14,19,27};
        int size = DataStore.length;

        QuickSort qs = new QuickSort();
        qs.Quick(DataStore, 0, size-1);
        qs.ShowData(DataStore, size);
    }
}