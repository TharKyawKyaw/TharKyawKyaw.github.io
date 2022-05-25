# Selection sort in Python


def selectionSort(array, size):
   
    for step in range(size):  # 0, size-1 step=0
        min_idx = step  #set step 0 as minimum index 

        for i in range(step + 1, size):  # 1 size-1
         
            # to sort in descending order, change > to < in this line
            # select the minimum element in each loop
            if array[i] < array[min_idx]:
                min_idx = i
         
        # put min at the correct position
        (array[step], array[min_idx]) = (array[min_idx], array[step])


data = [-2, 45, 0, 11, -9]
size = len(data)
selectionSort(data, size)
print('Sorted Array in Ascending Order:')
print(data)
