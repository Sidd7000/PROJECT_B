def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left, right = arr[:mid], arr[mid:]

    merge = lambda l, r: [l.pop(0) if l[0] < r[0] else r.pop(0) for _ in range(len(l) + len(r))]
    
    return merge(merge_sort(left), merge_sort(right))

if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6, 7]
    sorted_arr = merge_sort(arr)
    print("Sorted array:", sorted_arr)


/* This code is contributed by Hemanth Prabhu */
