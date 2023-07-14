score = int(input())
point = ''

if score >= 90:
    point = 'A'
elif score >= 80:
    point = 'B'
elif score >= 70:
    point = 'C'
elif score >= 60:
    point = 'D'
else:
    point = 'F'

print(point)
    