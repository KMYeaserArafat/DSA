
# Partition Method Whose is using into the Quick Method,
def Partition(DataStore, low, high):
    pivot = DataStore[high]
    i = low-1

    for x in range(low,high):
        if(DataStore[x]<=pivot):
            i = i+1
            temp = DataStore[i]
            DataStore[i] = DataStore[x]
            DataStore[x] = temp
        
    
    temp = DataStore[i+1]
    DataStore[i+1] = DataStore[high]
    DataStore[high] = temp

    return (i+1)


# Quick Sort Method, 
def Quick(DataStore, low, high):
    if(low<high):
        p = Partition(DataStore,low,high)
        Quick(DataStore,low,p-1)
        Quick(DataStore,p+1,high)


#Declear the DataStore & here already set the re-arrange data,
#In the size variable, declear the length of the DataStore,
DataStore = [24,9,29,14,19,27]
size = len(DataStore)
Quick(DataStore,0,size-1)
print(DataStore)
