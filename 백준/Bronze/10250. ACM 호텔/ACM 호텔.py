import sys

def solution(h, n):
    num = (n % h) * 100
    floor = n // h + 1
    if n % h == 0:
        num = h * 100
        floor = n // h
    floor = num + floor
    return floor


if __name__ == "__main__":
    n = int(input())

    for _ in range(n):
        h, w, n = map(int, sys.stdin.readline().rstrip().split())
        print(solution(h, n))
