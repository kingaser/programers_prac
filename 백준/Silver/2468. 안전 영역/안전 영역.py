import sys
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def bfs(x, y, h, ch):
    dq = deque()
    dq.append((x, y))
    ch[x][y] = 1

    while dq:
        tmp = dq.popleft()
        for i in range(4):
            nx = tmp[0] + dx[i]
            ny = tmp[1] + dy[i]
            if 0 <= nx < n and 0 <= ny < n:
                if board[nx][ny] > h and ch[nx][ny] == 0:
                    ch[nx][ny] = 1
                    dq.append((nx, ny))


n = int(input())
board = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

cnt = 0
res = 0

for h in range(100):
    ch = [[0]*n for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if ch[i][j] == 0 and board[i][j] > h:
                bfs(i, j, h, ch)
                cnt += 1

    res = max(res, cnt)
    if cnt == 0:
        break

print(res)
