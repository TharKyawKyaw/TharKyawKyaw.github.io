# 1 readlines to list
infile = open('data.txt', 'r')
'''
list = infile.readlines()
print(list)
-----
infile.readline()
infile.readline()
infile.readline()
print(infile.readline())
print(infile.readline())
print(infile.readline())
infile.close()
'''
text = infile.read()
mylist = text.split()
print(mylist)
print(text)

infile.close()
