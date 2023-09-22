import java.util.Scanner;

class LinearSearch{

    // Inseart Data, 
     public void InsertData(int[] DataStore, int space){
        Scanner sc1 = new Scanner(System.in);
        for(int a=0; a<space; a++){
            System.out.print("Enter the Data index of " + a + " : ");
            DataStore[a] = sc1.nextInt();
        }
        System.out.println(""); 
     }


     // Linear Search, 
    public int LinearSearch(int[] DataStore, int space, int search){

        for(int b=0; b<space; b++){
            if(DataStore[b]==search){
                return b;
            }
        }
        return -1;

    }

     //Print Data,
     public void ShowData(int[] DataStore, int space){
        System.out.print("Show DataStore Data : ");
        for(int a=0; a<space; a++){
            System.out.print(DataStore[a] + " ");
        }
        System.out.println(" ");
     }
     
     


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Data want-to entered : ");
        int space = sc.nextInt();

        int[] DataStore = new int[space];
       
        LinearSearch l1 = new LinearSearch();
        l1.InsertData(DataStore, space);
        l1.ShowData(DataStore, space);

        System.out.print("Search Data into the Data Store : ");
        int search = sc.nextInt();
        int result = l1.LinearSearch(DataStore, space, search);

        if(result==-1){
            System.out.println("Search Data is not found !!");
        }
        else{
            System.out.println("Search Data is found, Whose Index number is : " + result);
        }
        


    }
}