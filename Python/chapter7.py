from math import *
import sys

'''
filename = sys.argv[0]
userName = sys.argv[1]
userAge = sys.argv[2]
userCity = sys.argv[3]
print('arg 0 is : ', filename)
print('arg 1 is : ', userName)
print('arg 2 is : ', userAge)
print('arg 3 is : ', userCity)


C = float(sys.argv[1])
F = 9.0 * C / 5 + 32
print(C, ' C is ', F, ' F')


# eval
s = '10 - 2'
print(s)
print(eval(s))
print(eval('[1,4.5,6] + [2,3]'))
print(eval('"hello "*5'))


#exec
statement = 'r = 1+3'
exec(statement)
print('Value of exec r: ', r)
'''

formula = input('Write a formula involving x: ')
code = """
def f(x):
    return %s
""" % formula
exec(code)

x = int(input('Enter x value: '))
y = f(x)
print('f(%g)=%g' % (x, y))
