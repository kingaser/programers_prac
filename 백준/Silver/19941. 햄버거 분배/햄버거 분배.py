import sys

def solution(k, arr):
    cnt = 0

    for i in range(len(arr)):
        if arr[i] == 'P':
            for j in range(i - k, i + k + 1):
                if 0 <= j and j < len(arr) and arr[j] == 'H':
                    cnt += 1
                    arr[j] = ' '
                    break

    return cnt


if __name__ == "__main__":
    n, k = map(int, input().split())
    arr = list(sys.stdin.read())

    print(solution(k, arr))
