# create stack
from turtle import st


def create_stack():
    stack = []
    return stack


def push(stack, item):
    stack.append(item)
    print('pushed item: ', item)


def check_empty(stack):
    return len(stack) == 0


def pop(stack):
    if check_empty(stack):
        return 'stack is empty'
    else:
        return stack.pop()


stack = create_stack()
print(stack)
push(stack, str(1))
push(stack, str(2))
push(stack, str(3))
print(stack)
print('popped item: '+pop(stack))
print(' stack afer popping ', str(stack))
print('popped item: '+pop(stack))
print('popped item: '+pop(stack))
print('popped item: '+pop(stack))
