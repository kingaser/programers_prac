def insert_sort(arrA, arrB):
    for i in range(1, len(arrA)):
        idx = i
        tmp = arrA[i]
        while idx > 0 and arrA[idx - 1] > tmp:
            arrA[idx] = arrA[idx - 1]
            idx -= 1
            if arrA[idx] == arrB[idx] and arrA[idx - 1] == arrB[idx - 1]:
                if arrA == arrB:
                    return 1
        if arrA[idx] != tmp:
            arrA[idx] = tmp
            if arrA == arrB:
                return 1
    return 0




if __name__ == "__main__":
    n = int(input())
    arrA = list(map(int, input().split()))
    arrB = list(map(int, input().split()))

    print(insert_sort(arrA, arrB))
