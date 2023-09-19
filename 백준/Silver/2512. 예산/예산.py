import sys

def solution(m, arr):
    st, ed = 0, max(arr)
    while st <= ed:
        mid = (st + ed) // 2
        tot = 0
        for i in arr:
            if i > mid:
                tot += mid
            else:
                tot += i
        if m >= tot:
            st = mid + 1
        else:
            ed = mid - 1
    return ed


if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, sys.stdin.readline().rstrip().split()))
    m = int(input())

    print(solution(m, arr))
