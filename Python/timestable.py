# get size of table to print numbers
size = int(input('Please enter size of table: '))
# first row with numbers
print('  ', end='')
for i in range(1, size+1):
    print('{0:6}'.format(i), end='')
print()
# second row with + and ----
print('  +', end='')
for i in range(1, size+1):
    print('------', end='')
print()
# print table
for i in range(1, size+1):
    # print row numbers
    print('{0:3}|'.format(i), end='')
    for j in range(1, size+1):
        product = i*j
        print('{0:4}'.format(product), end='  ')

    print()
