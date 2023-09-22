import java.util.Scanner;

public class BinarySearch {
     Scanner sc = new Scanner(System.in);
    
     //Insert Data, 
    public void InsertData(int[] DataStore, int space){
        for(int a=0; a<space; a++){
            System.out.print("Input Data, into the Index of : ");
            int data = sc.nextInt();
            DataStore[a] = data;
        }
        System.out.println(" ");
    }

    // Sorting Data by Asending order,
    public void SortingData(int[] DataStore, int space){
        int temp; 
        for(int a=0; a<space; a++){
            for(int b=0; b<space; b++){
                if(DataStore[a]<DataStore[b]){
                    temp = DataStore[a];
                    DataStore[a] = DataStore[b];
                    DataStore[b] = temp;
                }
            }
        }
    }

    //Binary Search, 
    public int BinarySearch(int[] DataStore, int len, int search, int low, int high){
        if(low<=high){
            int mid = low + (high-low)/2;

            if(DataStore[mid]==search){
                return mid;
            }
            else if(DataStore[mid]<search){
                low = mid+1;
            }
            else if(DataStore[mid]>search){
                high = mid-1;
            }
        }

        return 0;
    }


    // Show Data,
    public void ShowData(int[] DataStore, int space){
        System.out.print("Show Data : ");
        for(int a=0; a<space; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("How Many Data wantto insert : ");
        int space = sc1.nextInt();

        int[] DataStore = new int[space];
        BinarySearch bs = new BinarySearch();
        bs.InsertData(DataStore, space);
        bs.SortingData(DataStore, space);
        bs.ShowData(DataStore, space);

        int len = DataStore.length;
        int low = 0;
        int high = len-1;

        System.out.print("Enter the Search Data : ");
        int searchData = sc1.nextInt();
        int result = bs.BinarySearch(DataStore, len, searchData, low, high);

        if(result==0){
            System.out.println("Data not found !!");
        }
        else{
            System.out.println("Search Data found, whose index number : " +  result);
        }





    }
}
