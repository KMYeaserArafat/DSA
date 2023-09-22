# Bubble Sort,

def BubbleSort(DataStore,dataSpace):
    temp =0
    for a in range(0,dataSpace):
        for b in range(0,dataSpace-a-1):
            if(DataStore[b]>DataStore[b+1]):
                temp = DataStore[b]
                DataStore[b] = DataStore[b+1]
                DataStore[b+1] = temp

                



DataStore = [-2,45,0,11,-9]
dataSpace = len(DataStore)
BubbleSort(DataStore, dataSpace)
print("Bubble Sorting DataStore : ",DataStore)