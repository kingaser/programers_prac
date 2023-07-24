import sys
import heapq

n, k = map(int, input().split())

jew = []

for _ in range(n):
    heapq.heappush(jew, list(map(int, sys.stdin.readline().rstrip().split())))

bags = []

for _ in range(k):
    bags.append(int(sys.stdin.readline()))

jew.sort(key = lambda x: (int(x[0]), -int(x[1])))
bags.sort()
jew_tmp = []
res = 0

for bag in bags:
    while jew and bag >= jew[0][0]:
        heapq.heappush(jew_tmp, -heapq.heappop(jew)[1])
    if jew_tmp:
        res -= heapq.heappop(jew_tmp)
    elif not jew:
        break

print(res)


