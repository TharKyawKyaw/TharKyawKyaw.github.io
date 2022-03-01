
star = int(input('Enter max star number : '))

row = 1
while row < star*2:

    if row <= star:
        count = star - row
        while count > 0:
            print(end=' ')
            count -= 1

        count = row
        while count > 0:
            print(end='*')
            count -= 1

    elif row > star:
        count = row - star
        while count > 0:
            print(end=' ')
            count -= 1

        count = row-star
        while count < star:
            print(end='*')
            count += 1

    print()
    row += 1
