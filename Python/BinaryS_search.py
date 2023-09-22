


#Insertion Method,
def InsertData(DataStore,space):
    for x in range(0,space):
        print("Inset Data Index : ", x)
        inputData = int(input())
        DataStore.append(inputData)

#Binary Search Method,

def BinarySearch(DataStore,searchData,low,high):
    while(low<=high):
        mid = low + (high-low)//2
        if(DataStore[mid]==searchData):
            return mid
        elif(DataStore[mid]<searchData):
            low = mid+1
            return low
        elif(DataStore[mid]>searchData):
            high = mid-1
            return high
    
    return -1


#----------------------Main-----------------

DataStore = []
space = int(input("How Many Data Want to Insert : "))
InsertData(DataStore,space)
DataStore.sort()
print("Show Data Store : ",DataStore)

searchData = int(input("Enter the Search Data into the DataStore : "))

low = 0
high = len(DataStore)-1

result = BinarySearch(DataStore,searchData,low,high)

if(result==-1):
    print("Data Not found !!")
else:
    print("Data found, Index Number : ", result)

