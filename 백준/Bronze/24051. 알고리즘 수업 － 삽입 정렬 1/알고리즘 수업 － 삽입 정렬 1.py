def insert_sort(arr):
    cnt = 0
    for i in range(1, len(arr)):
        idx = i
        tmp = arr[i]
        while idx > 0 and arr[idx - 1] > tmp:
            arr[idx] = arr[idx - 1]
            cnt += 1
            idx -= 1
            if cnt == k:
                return arr[idx]

        if arr[idx] != tmp:
            arr[idx] = tmp
            cnt += 1
            if cnt == k:
                return arr[idx]
    return -1


n, k = map(int, input().split())
arr = list(map(int, input().split()))

print(insert_sort(arr))
