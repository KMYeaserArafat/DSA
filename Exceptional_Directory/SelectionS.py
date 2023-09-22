#selection Sort, 


def SelectionSort(DataStore,size):
    for x in range(0,size-1):
        minimum = x
        for y in range(x+1,size):
            if(DataStore[minimum]>DataStore[y]):
                minIndex = y
            
            temp = DataStore[minIndex]
            DataStore[minIndex] = DataStore[x]
            DataStore[x] = temp
                



DataStore = [20,12,10,15,2]
size = len(DataStore)
SelectionSort(DataStore,size)
print("Sorted DataStore : ", DataStore)