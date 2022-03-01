print('Enter twenty non-negative floation-point value')

count = 0
sum = 0
while count < 20:
    num = float(input('Enter non negative floating value: '))
    if count == 0:
        max = num
        min = num
    if num < 0:
        print('Program terminate')
        break
    else:
        count += 1
        sum += num
        if num > max:
            max = num
        elif num < min:
            min = num

average = sum/count

print('Sum is :', sum)
print('Average is :', average)
print('Maximum number is :', max)
print('Minimum number is :', min)
