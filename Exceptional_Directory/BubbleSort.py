#Bubble Sort,
'''
It's totaly take dats into the data file, and bubble sorting, 

'''

def BubbleSort(DataStore,DataStoreSize):
    for x in range(0,DataStoreSize):
        for y in range(x,DataStoreSize):
            if(DataStore[y]<DataStore[x]):
                temp =  DataStore[x]
                DataStore[x] = DataStore[y]
                DataStore[y] = temp


DataStore = [10,100,20,11,33,30,99,69,19,100]
size  = len(DataStore)
print("Unsorting Data : ", DataStore)
BubbleSort(DataStore,size)
print("Sorting Data : ", DataStore)



