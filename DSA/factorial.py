from math import factorial


factorial = 1
i = 1
n = int(input('Enter factorial number: '))
while i <= n:
    factorial *= i
    i += 1

print('%d! factorial is : %d' % (n, factorial))
