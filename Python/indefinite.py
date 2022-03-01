# run program base on specified number to exit

done = False
sum = 0
while not done:
    entry = int(input('Enter a number: '))
    if entry == 999:
        done = True
    else:
        sum += entry

print('Sum is ', sum)
