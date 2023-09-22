

#Insetion Sort,

def InsertionSort(DataStore, size):
    for x in range(1,size):
        key = DataStore[x]
        previousIndex = x-1

        while key< DataStore[previousIndex] and previousIndex >=0:
            DataStore[previousIndex+1] = DataStore[previousIndex]
            previousIndex = previousIndex-1

        DataStore[previousIndex+1] = key 


#------------Main--------------------

DataStore = [5,9,1,4,3]
size = len(DataStore)
InsertionSort(DataStore,size)
print("Show Sorted DataStore : ", DataStore)



