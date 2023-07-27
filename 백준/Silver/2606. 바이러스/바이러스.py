import sys

def DFS(s):
    global res

    res += 1
    ch[s] = 1

    for i in arr[s]:
        if ch[i] == 0:
            DFS(i)


if __name__ == "__main__":
    n = int(input())
    m = int(input())

    arr = [[] for _ in range(n + 1)]
    for _ in range(m):
        a, b = map(int, sys.stdin.readline().rstrip().split())
        arr[a].append(b)
        arr[b].append(a)
    res = 0
    ch = [0]*(n + 1)
    DFS(1)
    print(res - 1)
