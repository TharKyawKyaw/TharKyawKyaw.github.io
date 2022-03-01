# use while to calculate factorial

def factorial(n):
    product = 1
    while n:
        product *= n
        n -= 1
    return product


def main():
    print('3! = ', factorial(3))
    print('2! = ', factorial(2))
    print('5! = ', factorial(5))


main()
