print('Enter 5 number!')
num1 = int(input('Enter first number: '))
num2 = int(input('Enter second number: '))
num3 = int(input('Enter third number: '))
num4 = int(input('Enter fourth number: '))
num5 = int(input('Enter fifth number: '))
max = num1
min = num1

if num2 > max:
    max = num2
elif num2 < min:
    min = num2

if num3 > max:
    max = num3
elif num3 < min:
    min = num3

if num4 > max:
    max = num4
elif num4 < min:
    min = num4

if num5 > max:
    max = num5
elif num5 < min:
    min = num5

print('Maximum number is ', max)
print('Minimum number is ', min)
