'''
 * #Process Of Counting Sort, 
1. Declear output array, whose size is (size+1);
2. set the fist index number as a max variable, 
3. Compare the max with another index number;
4. Declear count variable, whose space is (max+1);
5. Initialize count array with all zeros (0 to max)
6. Store the count of each element (0 to size)
7. Store the cummulative count of each array
8. Find the index of each element of the original array in count array, 
   and place the elements in output array
'''

def countingSort(array):
    size = len(array)
    output = [0] * size

    # Initialize count array
    count = [0] * 10

    # Store the count of each elements in count array
    for i in range(0, size):
        count[array[i]] += 1

    # Store the cummulative count
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Find the index of each element of the original array in count array
    # place the elements in output array
    i = size - 1
    while i >= 0:
        output[count[array[i]] - 1] = array[i]
        count[array[i]] -= 1
        i -= 1

    # Copy the sorted elements into original array
    for i in range(0, size):
        array[i] = output[i]




DataStore = [4, 2, 2, 8, 3, 3, 1]
size = len(DataStore)
print("UnSort DataStore : ", DataStore)
countingSort(DataStore)
print("Sorted DataStore : ", DataStore)