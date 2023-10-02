import sys

if __name__ == "__main__":
    n, m = map(int, input().split())
    res = n

    keyword = {}
    for _ in range(n):
        keyword[sys.stdin.readline().rstrip()] = 1

    for i in range(m):
        useWords = list(sys.stdin.readline().rstrip().split(','))



        for use in useWords:
            if use in keyword.keys():
                keyword.pop(use)
                res -= 1

        print(res)
