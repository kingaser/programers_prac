import sys
from collections import deque

dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]

def bfs(x, y, board):
    dq = deque()
    dq.append((x, y))

    while dq:
        tmp = dq.popleft()
        for i in range(8):
            xx = tmp[0] + dx[i]
            yy = tmp[1] + dy[i]
            if 0 <= xx < m and 0 <= yy < n and board[xx][yy] == 1:
                dq.append((xx, yy))
                board[xx][yy] = 0

    return cnt



while True:
    n, m = map(int, sys.stdin.readline().rstrip().split())
    board = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(m)]
    cnt = 0
    if n == 0 and m == 0:
        break
    for i in range(m):
        for j in range(n):
            if board[i][j] == 1:
                bfs(i, j, board)
                cnt += 1

    print(cnt)
