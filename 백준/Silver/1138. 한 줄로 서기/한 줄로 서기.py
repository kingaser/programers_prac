import sys

def solution(n, arr):
    res = [0] * n

    for i in range(n):
        for j in range(n):
            if arr[i] == 0 and res[j] == 0:
                res[j] = i + 1
                break
            elif res[j] == 0:
                arr[i] -= 1

    return res

if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, sys.stdin.readline().rstrip().split()))

    for x in solution(n, arr):
        print(x, end = ' ')
