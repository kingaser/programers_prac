# 2를 곱한다.
# 1을 수의 가장 오른쪽에 추가한다. 

import sys

def solution(n, m):
    # 연산 횟수 cnt
    cnt = 0
    # 0 보다 클 동안 반복
    while m > 0:
        # m 이 짝수면 2로 나누기 2를 곱한다를 반대로
        if m % 2 == 0:
            m /= 2
        # 1을 수의 가장 오른쪽에 추가한다를 m 을 10으로 나누는 것으로 대체
        elif m % 10 == 1:
            m //= 10
        # 위의 두 조건에 맞지 않으면 n 이 m 이 될 수 없는 수 이므로 -1출력
        else:
            print(-1)
            return
        # else에 걸리지 않아 계속 나눠지면서 연산 횟수 증가
        cnt += 1
        # n 이 m 과 같으면 연산이 마무리 된 것으로 연산횟수 + 1로 출력
        if n == m:
            print(cnt + 1)
            return
    # while 문에서 return 되지 않았으면 연산이 불가능한 수 이므로 -1출력 후 리턴
    print(-1)
    return


if __name__ == "__main__":
    n, m = map(int, sys.stdin.readline().rstrip().split())

    solution(n, m)

# import sys
# 
# def solution(n, m):
#     cnt = 0
#     # n 과 m 이 같지 않으면 반복
#     while n != m:
#         # tmp 에 주어진 m 값 저장
#         tmp = m
#         # m 이 2로 나눠지면 2 곱하기 연산을 반대로
#         if m % 2 == 0:
#             m /= 2
#         # m 이 10으로 나누어 지면 연산된 수의 우측에 1을 추가하는 연산 반대로
#         elif m % 10 == 1:
#             m //= 10
#         # 연산 횟수 증가
#         cnt += 1
#         # 위의 연산이 되지않아 연산 되어야 할 m 이 주어진 수와 같을 때 무한 반복 되므로 -1 출력후 함수 return
#         if tmp == m:
#             print(-1)
#             return
#     # 정상 연산 후 n != m 조건에 맞지 않으면 m 이 n 과 같은 수가 된 것이므로 연산횟수 + 1 로출력
#     else:
#         print(cnt + 1)
#         return
# 
# 
# if __name__ == "__main__":
#     n, m = map(int, sys.stdin.readline().rstrip().split())
# 
#     solution(n, m)

