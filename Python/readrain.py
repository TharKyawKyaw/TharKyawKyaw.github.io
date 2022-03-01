# read rain.txt file and list down the month and value
from calendar import month


infile = open('rain.txt', 'r')
months = []
values = []
for line in infile:
    words = line.split()
    if(words[0] != 'Year'):
        months.append(words[0])
        values.append(float(words[1]))

print(months)
print(values)
infile.close()
