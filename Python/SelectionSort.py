

# Selection Sort, 
def Selection(DataStore, size):
    for x in range(0,size-1):
        minIndex = x
        for y in range(x+1, size):
            if(DataStore[minIndex]>DataStore[y]):
                minIndex = y
            
            temp =  DataStore[minIndex]
            DataStore[minIndex] = DataStore[x]
            DataStore[x] = temp


def ShowData(DataStore,size):
    print("Show DataStore : ")
    for x in range(0,size):
        print(DataStore[x])

#--------main-----------

DataStore = [20,12,10,15,2]
size = len(DataStore)
Selection(DataStore, size)
ShowData(DataStore,size)
