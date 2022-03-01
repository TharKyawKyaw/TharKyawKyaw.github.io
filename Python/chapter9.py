class Person:
    def __init__(self, name):
        self.name = name

    def sayhi(self):
        print('Hi', self.name)


p1 = Person('Mg Mg')
p1.sayhi()
print(p1.name)
