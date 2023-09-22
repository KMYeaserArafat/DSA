


def LinearSearch(DataStore, size_of_store,search):
    countData = 0
    for x in range(0,size_of_store):
        if(DataStore[x]==search):
            countData += countData
    
    if(countData !=0):
        print(f"{search} Data is found {countData} times")
    else:
        print(f"{search} Data is not found")




DataStore = [20,10,30,5,9,7]
size_of_store = len(DataStore)
search = input("Enter search value : ")
LinearSearch(DataStore,size_of_store,search)