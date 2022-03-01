# Division
from unittest import result


print('Enter two number to divide')
divident = int(input('Enter divident: '))
divisor = int(input('Enter divisor: '))
result = divident / divisor
print(divident, ' / ', divisor, ' = ', result)

# Half
value = int(input('Enter a number to half '))
result = value / 2
print('Half of ', value, ' is ', result)


# temp convert
# C = 5 / 9 * ( F-32 )
degreesF = float(input('Enter F Degrees: '))
# Business Logic
degreesC = 5/9 * (degreesF-32)
# output
print(degreesF, ' degrees F = ', degreesC, ' degrees C')

# Time Convertion
seconds = int(input('Enter seconds: '))
hour = seconds // 3600
seconds = seconds % 3600
minute = seconds // 60
seconds = seconds % 60
print(hour, 'hours : ', minute, 'minutes : ', seconds, 'seconds')
