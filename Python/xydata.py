file =open('xy.dat','w')
file.write("""(1.3,0) (-1,2) (3,-1.5)
(0,1) (1,0) (1,1)
(0,-0.01) (10.5,-1) (2.5,-2.5)
""")
file.close()

inline =open('xy.dat','r')
lines = inline.readlines()
inline.close()

data=[]
for line in lines:
    words = line.split()

    for word in words:
        word = word[1:-1]

        x,y = word.split(',')

        mydata=(float(x),float(y))
        data.append(mydata)

print(data)
