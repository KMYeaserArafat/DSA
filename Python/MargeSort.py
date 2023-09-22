# Marge Sort, 

def Devide(DataStore,start,mid,end):
    #declear 2 length for 2 new array,
    len1 = mid-start+1
    len2 = end-mid

    #declear 2 new array, 
    leftsideArr = []
    rightsideArr = []

    #include data, 
    for x in range(0,len1):
        leftsideArr[x] = leftsideArr[start+x] 
    for y in range(0,len2):
        rightsideArr[y] = rightsideArr[end+1+y]

    #sorting,
    i=0 
    j=0
    k=start

    while(i<len1 and j<len2):
        if(leftsideArr[i]<=rightsideArr[j]):
            DataStore[k] = leftsideArr[i]
            i = i+1
        else:
            DataStore[k] = rightsideArr[j]
            j = j+1
        k = k+1

    
    while(i<len1):
        DataStore[k] = leftsideArr[i]
        i = i+1
        k = k+1

    while(j<len2):
        DataStore[k] = rightsideArr[j]
        j = j+1
        k = k+1




def MargeSort(DataStore,start,end):
    if(start<end):
        mid = start + (end-start)//2

        MargeSort(DataStore,start,mid)
        MargeSort(DataStore,mid+1,end)
        Devide(DataStore,start,mid,end)




DataStore = [6,5,12,10,9,1]
size = len(DataStore)
start = 0
end = size-1
print("UnSorted DataStore : ", DataStore)
MargeSort(DataStore,start,end)
print("  Sorted DataStore : ", DataStore)

