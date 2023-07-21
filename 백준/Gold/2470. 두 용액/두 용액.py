import sys

n = int(input())
liquid = list(map(int, sys.stdin.readline().rstrip().split()))

def solution(liquid):
    liq1 = liq2 = 0
    answer, res = 2147483647, 0
    p1, p2 = 0, n - 1

    while p1 < p2:
        res = liquid[p1] + liquid[p2]
        if abs(res) < answer:
            answer = abs(res)
            liq1, liq2 = liquid[p1], liquid[p2]
        if res < 0:
            p1 += 1
        else:
            p2 -= 1

    return liq1, liq2



if __name__ == "__main__":
    liquid.sort()
    a, b = solution(liquid)
    print(a, b)

