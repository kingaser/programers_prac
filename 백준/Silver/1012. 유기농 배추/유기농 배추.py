import sys

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y):
    global cnt

    board[x][y] = 0

    for i in range(4):
        xx = x + dx[i]
        yy = y + dy[i]
        if 0 <= xx < n and 0 <= yy < m and board[xx][yy] == 1:
            DFS(xx, yy)



if __name__ == "__main__":
    T = int(input())

    for _ in range(T):
        n, m, k = map(int, sys.stdin.readline().rstrip().split())

        board = [[0]*m for _ in range(n)]

        cnt = 0

        for i in range(k):
            x, y = map(int, sys.stdin.readline().rstrip().split())
            board[x][y] = 1

        for i in range(n):
            for j in range(m):
                if board[i][j] == 1:
                    DFS(i, j)
                    cnt += 1
        print(cnt)
