count = sum = 0
print('Enter 5 numbers ! ')
while count < 5:
    val = float(input('Enter number: '))
    if val < 0:
        print('Unacceptable! Termination --- !')
        break
    count += 1
    sum += val
else:
    print('Avg = ', sum/count)
