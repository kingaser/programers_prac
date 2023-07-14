a = int(input())
b = int(input())
c = int(input())
arr = [0]*10
mul = a * b * c

while mul > 0:
    arr[mul % 10] += 1
    mul //= 10

for a in arr:
    print(a)