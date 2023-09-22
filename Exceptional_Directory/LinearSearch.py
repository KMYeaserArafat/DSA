#Linear Search 
'''
here all data stored from  into  'dataFile.txt' file and store in a DataStore, 
search a userInput data into the DataStore, 
      ---- If Data is found, print the Index number, 
       ------else, data is not found, print it and insert this search data into the DataStore 
'''

def LinearSearch(DataStore,size,searchData):
    for a in range(0,size):
        if(searchData==DataStore[a]):
            return a
        
    return -1


fileData = open('dataFile.txt',"r")

fileread = fileData.read()
DataStore = fileread.split(",")
print("Show Data Store : ",DataStore)
size = len(DataStore)

searchData = str(input("Enter the search Data : "))
result = LinearSearch(DataStore,size,searchData)

if(result != -1):
    print("Search Data is found,Into the index of : ", result)
else:
    print("Search Data isn't found !!")
    option = input("Are you want-to Insert Search Data (y/n) : ")
    if(option == 'y'):
        DataStore.append(searchData)
        print(DataStore)
    elif(option == 'n'):
        print("Okey, Thanks !!")


fileData.close()