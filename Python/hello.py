print('Hello World!')
_name = 'Eric'
age = 29
city = 'Yangon'
my_statement = "He lives in Yangon"
about_me = """This is about me.
How are you?"""
print(my_statement, about_me)
# Single line Comment
'''
    Multi
    Line
    Comment
'''
print(_name, age, city)

if(age > 20):
    print('age is over 20')
    print('Age block')
    print('Age final')
else:
    print('Age is less than 20')
    print('This is else block')


# with [],{},()
fruits = ['Banana', 'Mango',
          'Orange', 'Papaya']
print(fruits)
myInfo = _name + \
    city + \
    my_statement + \
    about_me
print(myInfo)
