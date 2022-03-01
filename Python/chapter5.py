# while loop

count = 10
while count < 9:
    print('Count value is ', count)
    count += 1
else:
    print(count, ' Count is greater than or equal to 9 ')
print('Bye!')

ans = 'y'
while ans == 'y':
    number = int(input('Enter a number to check even or odd : '))
    if number % 2:
        print(number, ' is ODD')

    else:
        print(number, ' is EVEN')

    ans = input('Wanna try again? y/n : ')
