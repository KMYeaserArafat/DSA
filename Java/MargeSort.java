// Marge Sort, 

public class MargeSort{

    //Divide, 
    public void Devide(int[] DataStore,int start,int mid, int end){
        
        int len1 = mid - start+1; 
        int len2 = end-mid;

        //Declear Array, 
        int[] leftDataStore = new int[len1];
        int[] rightDataStore  = new int[len2];

        //Declear Value into the new 2 Array's, 
        for(int i=0; i<len1; i++){
            leftDataStore[i] = DataStore[start+i];
        }
        for(int j=0; j<len2; j++){
            rightDataStore[j] = DataStore[mid+1 + j];
        }

        //here start the condition for sorting, 
        int i = 0;
        int j = 0; 
        int k = start;

        while(i<len1 && j<len2){
            if(leftDataStore[i]<=rightDataStore[j]){
                DataStore[k] = leftDataStore[i];
                i++;
            }
            else{
                DataStore[k] = rightDataStore[j];
                j++;
            }
            k++;
        }

        while(i<len1){
            DataStore[k] = leftDataStore[i];
            i++;
            k++;
        }

        while(j<len2){
            DataStore[k]=  rightDataStore[j];
            j++;
            k++;
        }

        
    }
    
    //Marge,
    public void Marge(int[] DataStore,int start, int end){
    if(start<end){
        int mid = start + (end-start)/2;
        Marge(DataStore, start, mid);
        Marge(DataStore, mid+1, end);
        Devide(DataStore, start,mid, end);
    }
    }

    
    // Print Data Store, 
    public void DataStore(int[] DataStore, int size){
        System.out.print("Show Data Store : ");
        int a = 0;
        while(a<size){
            System.out.print(DataStore[a] + " ");
            a++;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] DataStore = {6,5,12,10,9,1};
        int size = DataStore.length;

        MargeSort mg = new MargeSort();
        mg.Marge(DataStore,0,size-1);
        mg.DataStore(DataStore, size);
        

        
    }
}