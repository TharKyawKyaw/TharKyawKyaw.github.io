# Arithmetic Operator

num1 = int(input('Enter First Number: '))
num2 = int(input('Enter Second NUmber: '))
num3 = num1 + num2  # Add
num4 = num1 - num2  # Sub
num5 = num1 * num2  # multiply
num6 = num1 / num2  # Divided
num7 = num1 % num2  # Modulus
num8 = num1 // num2  # floor division
num9 = num1**num2  # Exponent

print(num3)
print(num4)
print(num5)
print(num6)
print(num7)
print(num8)
print(num9)

# Comparison Operators ( == , != , <> , >= , <= , > , < )
if num1 == num2:
    print('%s is equal to %s' % (num1, num2))

if num1 != num2:
    print('%s is not equal to %s' % (num1, num2))

if num1 > num2:
    print('%s is greater than %s' % (num1, num2))

if num1 < num2:
    print('%s is less than %s' % (num1, num2))

if num1 >= num2:
    print('%s is greater than or equal %s' % (num1, num2))

if num1 <= num2:
    print('%s is less than or equal %s' % (num1, num2))


# Assignment Operators ( = , += , -= , *= , /= , %= , **= , //= )

num10 = num1 + num2
num10 += num2
num10 -= num2
num10 *= num1
print('Num10 is %s ' % (num10))

a = 60
# 0011 1100
# 1111 0000 => 128 +64 + 32 + 16 => 240
# 0000 1111 => 8 + 4 + 2 + 1 => 15
# 32 + 16 + 8 + 4 => 60
# 128 64 32 16 8 4 2 1
#
# 1284 => 1000 + 200 +80 +4
#     => 1* 10**3 + 2* 10**2 + 8* 10**1 + 4* 10**0
print(a << 2)

# 1001 => 9
# 1100 => 12
# &1000 => 8
# |1101 => 13
# ^0101 => 5


a = 9
b = 12
print(a & b)
print(a | b)
print(a ^ b)

#  0000 1100 => 12
#  1111 0011 => MSB => First one is 1 => (- Negative)
# 1 complement => 0000 1100
# 2 complement => 0000 1101 => -13

print(~a)
print(~b)

# Logical Operators

if(5 < 9) and (2 > 1):
    print('ok')

print(True and True)
print(True or False)
print(not(True))
