#Binary Search, 
'''
here all data stored from  into  'dataFile.txt' file and store in a DataStore, 
search a userInput data into the DataStore, 
      ---- If Data is found, print the Index number, 
       ------else, data is not found, print it and insert this search data into the DataStore 
'''


def BinarySearch(DataStore,searchData,low,high):
    while(low<=high):
        mid = low + (high-low)//2

        if(searchData==DataStore[mid]):
            return mid
        elif(searchData>DataStore[mid]):
            low = mid+1
            return low
        elif(searchData<DataStore[mid]):
            high = mid-1
    return -1



FileData = open('dataFile.txt', "r")

readData = FileData.read()
DataStore = readData.split(',')
print("Show Data List : ",DataStore)
size = len(DataStore)
low = 0
high = size-1

searchData = str(input("Enter the Search Data : "))

result = BinarySearch(DataStore,size,searchData,low,high)

if(result !=-1):
    print("Search Data is found,Number of Index : ", result)
else:
    print("Search Data isn't found !!")


FileData.close()