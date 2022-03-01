class Person:
    def __init__(self, name, email=None, mobile=None, office=None, private=None):
        self.name = name
        self.email = email
        self.mobile = mobile
        self.office = office
        self.private = private

    def add_email(self, email):
        self.email = email

    def add_mobile(self, mobile):
        self.mobile = mobile

    def add_office(self, office):
        self.office = office

    def add_private(self, private):
        self.private = private

    def dump(self):
        s = self.name + '\n'
        if self.email is not None:
            s += 'Email: %s \n' % (self.email)
        if self.mobile is not None:
            s += 'Private Phone: %s \n' % (self.mobile)
        if self.office is not None:
            s += 'Office: %s \n' % (self.office)
        if self.private is not None:
            s += 'Private: %s \n' % (self.private)
        print(s)


p1 = Person('Mg Mg', 'mgmg@gmail.com')
p1.add_mobile('09123456789')
p1.add_office('09111222333')
p1.add_private('09224466889')
p1.dump()
p2 = Person('Ag Ag', 'agag@gmail.com', '09456789123')
phone_book_list = [p1, p2]
phone_book = {'mgmg': p1, 'agag': p2}

for p in phone_book:
    print(phone_book[p])
