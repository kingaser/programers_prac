n = int(input())
i = n
for _ in range(n):
    for _ in range(i, 0, -1):
        print("*", end='')
    print()
    i -= 1
