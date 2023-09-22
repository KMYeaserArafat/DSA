#insertion Sort, 

def InsertionSort(DataStore,size):
    for x in range(1,size):
        key = DataStore[x]
        previousIndex =  x-1

        while(key<DataStore[previousIndex] and previousIndex>=0):
            DataStore[previousIndex+1] = DataStore[previousIndex]
            previousIndex = previousIndex-1
        
        DataStore[previousIndex+1] = key
    
   
    


DataStore = [20,12,10,15,2]
size =  len(DataStore)
print("Unsorted Data : ", DataStore)
InsertionSort(DataStore,size)
print("  Sorted Data : ", DataStore)
