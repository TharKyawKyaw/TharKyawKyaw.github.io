# temp.dat to dictionary
file = open('temps.dat', 'r')
temps = {}

for line in file.readlines():
    # print(line)
    words = line.split()
    c, t = words
    #print(c, t)
    temps[c[:-1]] = t

print(temps)
file.close()
