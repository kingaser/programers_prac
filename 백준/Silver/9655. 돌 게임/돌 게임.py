import sys

def solution(n):
    if n % 2 == 0:
        return "CY"
    else:
        return "SK"


if __name__ == "__main__":
    n = int(input())

    print(solution(n))
