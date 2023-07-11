def insert_sort(arrA, arrB):
    s = 0
    for i in range(n):
        if arrA[i] == arrB[i]:
            s += 1

    for i in range(1, len(arrA)):
        idx = i
        tmp = arrA[i]
        while idx > 0 and arrA[idx - 1] > tmp:
            f = arrA[idx] == arrB[idx]
            arrA[idx] = arrA[idx - 1]
            if f and arrA[idx] != arrB[idx]:
                s -= 1
            elif not f and arrA[idx] == arrB[idx]:
                s += 1
            if s == n:
                return 1
            idx -= 1
        if idx + 1 != i:
            f = arrA[idx] == arrB[idx]
            arrA[idx] = tmp
            if f and arrA[idx] != arrB[idx]:
                s -= 1
            elif not f and arrA[idx] == arrB[idx]:
                s += 1
            if s == n:
                return 1
    return 0
    #         arrA[idx] = arrA[idx - 1]
    #         idx -= 1
    #         if arrA == arrB:
    #             return 1
    #     if arrA[idx] != tmp:
    #         arrA[idx] = tmp
    #         if arrA == arrB:
    #             return 1
    # return 0




if __name__ == "__main__":
    n = int(input())
    arrA = list(map(int, input().split()))
    arrB = list(map(int, input().split()))

    print(insert_sort(arrA, arrB))
