a = list(map(int, input().split()))
a.sort()
money = 0
if a[0] == a[1] == a[2]:
    money = 10000 + a[0] * 1000
elif a[0] == a[2] or a[1] == a[2]:
    money = 1000 + a[2] * 100
elif a[0] == a[1]:
    money = 1000 + a[1] * 100
else:
    money = a[2] * 100

print(money)
