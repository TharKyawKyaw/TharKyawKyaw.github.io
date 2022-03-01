# list the factors of 1 to Max
'''
    6 => 6 : 1 2 3 6
'''
MAX = 10
n = 1
while n <= MAX:
    factor = 1
    print(end=str(n)+' : ')
    while factor <= n:
        if n % factor == 0:
            print(factor, end=' ')
        factor += 1
    print()
    n += 1
