# overiding ___init___

import random


class Animal(object):
    def __init__(self, name):
        self.name = name


class Dog(Animal):
    def __init__(self, name):
        super(Dog, self).__init__(name)
        self.breed = random.choice(['GR', 'Pub', 'BullDog'])

    def fetch(self, thing):
        print('%s %s fetch the %s!' % (self.name, self.breed, thing))


d = Dog('Ranger')
d.fetch('ball')
