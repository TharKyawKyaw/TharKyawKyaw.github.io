class Account:
    def __init__(self, name, acc_no, initial_amount):
        self._name = name
        self._no = acc_no
        self._balance = initial_amount

    def deposit(self, amount):
        self._balance += amount

    def withdraw(self, amount):
        self._balance -= amount

    def dump(self):
        s = "%s , %s has balance : %s" % (self._name, self._no, self._balance)
        print(s)


a1 = Account('Mg Mg', '12345', 50000)
a2 = Account('Aye Aye', '12346', 150000)
a1.dump()
a2.dump()
a1.deposit(500000)
a2.deposit(1000000)
a1.dump()
a2.dump()
a1.withdraw(40000)
a2.withdraw(150000)
a1.dump()
a2.dump()
a1.name = "Mg Mg Aye"
a1.dump()
a2.dump()
