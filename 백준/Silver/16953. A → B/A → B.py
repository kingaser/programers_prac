import sys

def solution(n, m):
    cnt = 0
    while m > 0:
        if m % 2 == 0:
            m /= 2
        elif m % 10 == 1:
            m //= 10
        else:
            print(-1)
            return
        cnt += 1
        if n == m:
            print(cnt + 1)
            return
    print(-1)
    return


if __name__ == "__main__":
    n, m = map(int, sys.stdin.readline().rstrip().split())

    solution(n, m)
