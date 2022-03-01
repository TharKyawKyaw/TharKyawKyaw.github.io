# string manipulation

s = 'This is a string!'
slist = s.split()

mystring = '@'.join(slist)
print(mystring)

print(slist)
result = 'is' in slist
print(result)
index = s.find('z')
print(index)
slen = len(s)
print(slen)
print(s[6:12])
print(s[:-2])
newstring = s.replace(' ','-')
print(newstring)
mystring = s.replace(s[:s.find(' is')],'Gucci!')
print(mystring)
print(s.find('a'))
#s[8]= 'b'
print(s[8])

s1 = "   Hello Bootcamper!   "
print(len(s1))
s2 = s1.strip()
print(s1)
print(s2)
print(s2.startswith('Hello'))
print(s2.endswith('!'))
if s2.startswith('Hello'):
    print('Starts with "HELLO" ')