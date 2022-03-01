# functions :
'''
import sys
sum = 0
while True:
    val = int(input('Enter number (999 to exit) : '))
    if val == 999:
        sys.exit(0)

    sum += val
    print('Sum is : ', sum)
'''
mylist = [2, 4, 6, 8, 9]
print(mylist)
print(mylist.index(2))
mylist.append(12)
print(mylist)
mylist.insert(3, 15)
print(mylist)
print(type(mylist))


def sayHi(message='Kyaw'):
    print('Hi', message)


sayHi('Thar')
sayHi()


def F(C):
    return (9.0/5) * C + 32


fdegree = F(45)
print(fdegree)

# y(t) = v0t + 1/2gt2


def y(t, v0):
    return v0*t + 0.5*g*t**2


g = 9.81
y1 = y(12, 35)
y2 = y(2, v0=6)
y3 = y(t=3, v0=5)
print(y1, y2, y3)
