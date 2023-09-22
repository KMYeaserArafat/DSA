#Heap Sort,


def Heapy(DataStore,size,i):
    largest = i
    left = 2*i+1
    right = 2*i+2

    if(left<size and DataStore[left]>=DataStore[largest]):
        largest = left
    
    if(right<size and DataStore[right]>=DataStore[largest]):
        largest = right

    if(largest !=i):
        temp  = DataStore[i]
        DataStore[i] = DataStore[largest]
        DataStore[largest] = temp

        Heapy(DataStore,size,largest)


#Heap Sort Method, 
def HeapSort(DataStore,size):
    #max Heap, 
    
    for x in range(size//2,-1,-1):
        Heapy(DataStore,size,x)

    #sort, 
    for y in range(size-1,0,-1):
        temp  = DataStore[0]
        DataStore[0] = DataStore[y]
        DataStore[y] = temp

        Heapy(DataStore,y,0)



DataStore = [1,12,9,5,6,10]
size = len(DataStore)
print("UnSort DataStore : ",DataStore)
HeapSort(DataStore,size)
print("  Sort DataStore : ",DataStore)