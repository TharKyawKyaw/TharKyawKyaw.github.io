star = int(input('Enter max star number : '))


row = 1
while row < star*2:

    if row < star:
        count = 1
        while count <= row:
            print(end='*')
            count += 1

    elif row >= star:
        count = star*2
        while count > row:
            print(end='*')
            count -= 1

    print()
    row += 1

'''
row = 0
while row < star:

    count = 0
    while count <= row:
        print(end='*')
        count += 1

    print()
    row += 1

row = star-1
while row > 0:
    count = 0
    while count < row:
        print(end="*")
        count += 1
    print()
    row -= 1
'''
