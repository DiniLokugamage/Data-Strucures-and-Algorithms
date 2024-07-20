def swap(list, i, j):
    temp = list[i]
    list[i] = list[j]
    list[j] = temp

def partision(list, start, end):
    print("List: ", list[start:end + 1])
    pivot = list[end]
    print("Pivot: ", pivot) # take the right most element as pivot
    i = start - 1
    j = start

    while(j<end):
        while(pivot<list[j]):
            j += 1
        i += 1
        swap(list, i, j)
        print("List: ", list, "i: ", i, "j: ", j)
    print ("partisioned list: ", list)
    return i

def quickSort(list, start, end):
    if(start < end):
        piviot = partision(list, start, end)
        quickSort(list, start, piviot - 1) 
        quickSort(list, piviot + 1, end)



list = [50, 23, 9, 18, 61, 32]
quickSort(list, 0, len(list) - 1)