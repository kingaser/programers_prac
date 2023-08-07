import sys
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

n, m = map(int, sys.stdin.readline().rstrip().split())
board = [list(map(int, sys.stdin.readline().split())) for _ in range(m)]

dis = [[0]*n for _ in range(m)]

dq = deque()
for i in range(m):
    for j in range(n):
        if board[i][j] == 1:
            dq.append((i, j))

res = 0

while dq:
    tmp = dq.popleft()
    for i in range(4):
        x = tmp[0] + dx[i]
        y = tmp[1] + dy[i]
        if 0 <= x < m and 0 <= y < n and board[x][y] == 0:
            dq.append((x, y))
            board[x][y] = 1
            dis[x][y] = dis[tmp[0]][tmp[1]] + 1
            if dis[x][y] > res:
                res = dis[x][y]

flag = True
for i in range(m):
    for j in range(n):
        if board[i][j] == 0:
            flag = False

if not flag:
    print(-1)
else:
    print(res)

