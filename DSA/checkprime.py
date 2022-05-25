flag = True
i = 2
n = int(input('Enter number to check prime: '))
while i < n/2:
    if n % i == 0:
        flag = False
        break
    else:
        i += 1

if flag:
    print(n, ' is prime')
else:
    print(n, ' is not prime!')
