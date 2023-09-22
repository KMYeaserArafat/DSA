#Quick Sort, 


def Partition(DataStore,low,high):
    pivot = DataStore[high]
    i = low-1

    for x in range(low,high):
        if(pivot>=DataStore[x]):
            i = i+1
            temp  = DataStore[i]
            DataStore[i] = DataStore[x]
            DataStore[x] = temp

    temp  = DataStore[i+1]
    DataStore[i+1] = DataStore[high]
    DataStore[high] = temp

    return (i+1)


def QuickSort(DataStore,low,high):
    if(low<high):
        pi = Partition(DataStore,low,high)
        QuickSort(DataStore,low,pi-1)
        QuickSort(DataStore,pi+1,high)



DataStore = [8,7,6,1,0,9,2]
size  = len(DataStore)
low = 0
high = size-1
print("Unsorted DataStore : ", DataStore)
QuickSort(DataStore,low,high)
print("  Sorted DataStore : ", DataStore)